package pl.pcukierski.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

@Data
@AllArgsConstructor
public class SongDAO {
    private Integer id;
    private String title;
    private String album;
    private String artist;
    private int minuteOfLength;
    private int secondOfLength;

    public SongDAO() {

    }
}
