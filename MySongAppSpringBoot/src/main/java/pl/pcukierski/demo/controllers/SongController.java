package pl.pcukierski.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import pl.pcukierski.demo.Mapper;
import pl.pcukierski.demo.dao.SongDAO;
import pl.pcukierski.demo.database.SongData;
import pl.pcukierski.demo.exception.IdException;
import pl.pcukierski.demo.repository.SongRepo;
import pl.pcukierski.demo.services.SongService;


import javax.persistence.EntityNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
    @RequestMapping(value = "/songs")
    public class SongController {

        private int counter = 0;
        private List<SongDAO> availableSongList = new ArrayList<>();
        private List<SongDAO> boughtSongList = new ArrayList<>();

        @Autowired
        SongRepo songRepo;

        @Autowired
        SongService songService;

        @PostMapping
        @ResponseBody
        public void addSong(@RequestBody SongDAO newSong){
            newSong.setId(counter);
            songService.saveSong(Mapper.songDatatoSongDAO(newSong));
            availableSongList.add(newSong);
            counter++;
        }

        @GetMapping(value = "buySong/{id}")
        public void buySongById(@PathVariable("id") Integer id){
            try{
                SongDAO boughtSong = songService.getSongById(id);
                boughtSongList.add(boughtSong);
            }
            catch(EntityNotFoundException e){
                System.err.println("Don't find record with this ID!");
            }
        }

        @GetMapping(value = "/viewBoughtSong/{id}")
        public SongDAO viewBoughtSongById(@PathVariable("id") Integer id){
            try{
                SongDAO boughtSong = boughtSongList.get(id);
                return boughtSong;
            }
            catch(IndexOutOfBoundsException e){
                System.err.println("Index out of bounds exception!");
            }
            return null;
        }

        @GetMapping(value = "/viewAvailableSong/{id}")
        public SongDAO viewSongById(@PathVariable("id") Integer id){
           try{
               SongDAO songDAO = songService.getSongById(id);
               return songDAO;
           }
           catch(EntityNotFoundException e){
               System.err.println("Don't find record with this ID!");
           }
           return null;
        }

        @GetMapping(value = "/deleteSongById/{id}")
        public void deleteSongById(@PathVariable("id") int id){
            SongDAO songDAO = songService.getSongById(id);
            songRepo.delete(Mapper.songDatatoSongDAO(songDAO));
        }
}

