package pl.pcukierski.demo.database;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigInteger;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "songs")
public class SongData extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "artist")
    private String artist;

    @Column(name = "album")
    private String album;

    @Column(name = "minute_of_length")
    private int minute_of_length;

    @Column(name = "second_of_length")
    private int second_of_length;

}
