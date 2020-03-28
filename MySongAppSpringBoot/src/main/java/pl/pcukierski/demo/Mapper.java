package pl.pcukierski.demo;

import pl.pcukierski.demo.dao.SongDAO;
import pl.pcukierski.demo.dao.UserDAO;
import pl.pcukierski.demo.database.SongData;
import pl.pcukierski.demo.database.UserData;

public class Mapper {

    public static SongDAO songToSongData(SongData data){
        SongDAO songDao = new SongDAO();
        songDao.setId(data.getId());
        songDao.setTitle(data.getTitle());
        songDao.setAlbum(data.getAlbum());
        songDao.setArtist(data.getArtist());
        songDao.setMinuteOfLength(data.getMinute_of_length());
        songDao.setSecondOfLength(data.getSecond_of_length());
        return songDao;
    }

    public static SongData songDatatoSongDAO(SongDAO songDAO){
        SongData songData = new SongData();
        songData.setId(songDAO.getId());
        songData.setTitle(songDAO.getTitle());
        songData.setAlbum(songDAO.getAlbum());
        songData.setArtist(songDAO.getArtist());
        songData.setMinute_of_length(songDAO.getMinuteOfLength());
        songData.setSecond_of_length(songDAO.getSecondOfLength());
        return songData;
    }

    public static UserData userDAOtoUserData(UserDAO userDAO){
        UserData userData = new UserData();
        // userData.setId(userDAO.getId());
        userData.setFirst_name(userDAO.getFirstName());
        userData.setLast_name(userDAO.getSurname());
        userData.setEmail(userDAO.getEmail());
        return userData;
    }

    public static UserDAO userDatatoUserDAO(UserData userData){
        UserDAO userDAO = new UserDAO();
        userDAO.setFirstName(userData.getFirst_name());
        userDAO.setSurname(userData.getLast_name());
        userDAO.setEmail(userData.getEmail());
        return null;
    }
}
