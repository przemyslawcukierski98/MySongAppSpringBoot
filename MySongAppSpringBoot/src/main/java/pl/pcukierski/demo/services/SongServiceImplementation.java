package pl.pcukierski.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pcukierski.demo.Mapper;
import pl.pcukierski.demo.dao.SongDAO;
import pl.pcukierski.demo.database.SongData;
import pl.pcukierski.demo.repository.SongRepo;

import java.math.BigInteger;

@Service
public class SongServiceImplementation extends BaseServiceImplementation<SongData, Long, SongRepo> implements SongService {

    @Autowired
    private SongRepo songRepo;

    @Override
    public SongRepo getRepository() {
        return songRepo;
    }

    @Override
    public SongDAO getSongById(Integer id) {
        return Mapper.songToSongData(getSong(id));
    }
}
