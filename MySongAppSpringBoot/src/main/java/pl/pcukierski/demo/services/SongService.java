package pl.pcukierski.demo.services;

import org.springframework.stereotype.Service;
import pl.pcukierski.demo.dao.SongDAO;
import pl.pcukierski.demo.database.SongData;
import pl.pcukierski.demo.repository.SongRepo;

import java.math.BigInteger;

@Service
public interface SongService extends BaseService<SongData, Long, SongRepo> {

    public SongDAO getSongById(Integer id);

}
