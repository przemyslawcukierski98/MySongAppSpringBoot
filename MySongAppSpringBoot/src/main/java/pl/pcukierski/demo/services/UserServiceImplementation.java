package pl.pcukierski.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pcukierski.demo.Mapper;
import pl.pcukierski.demo.dao.UserDAO;
import pl.pcukierski.demo.database.UserData;
import pl.pcukierski.demo.repository.UserRepo;

@Service
public class UserServiceImplementation extends BaseServiceImplementation<UserData, Long, UserRepo> implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDAO createUser(UserDAO userDAO){
        UserData userData = saveSong(Mapper.userDAOtoUserData(userDAO));
        return Mapper.userDatatoUserDAO(userData);
    }

    @Override
    public UserDAO editUser(UserDAO userDAO){
        UserData userData = saveSong(Mapper.userDAOtoUserData(userDAO));
        return Mapper.userDatatoUserDAO(userData);
    }
}
