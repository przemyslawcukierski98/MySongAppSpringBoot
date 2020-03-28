package pl.pcukierski.demo.services;

import org.springframework.stereotype.Service;
import pl.pcukierski.demo.dao.UserDAO;
import pl.pcukierski.demo.database.UserData;
import pl.pcukierski.demo.repository.UserRepo;

@Service
public interface UserService extends BaseService<UserData, Long, UserRepo> {

    public UserDAO createUser(UserDAO userDAO);

    public UserDAO editUser(UserDAO userDAO);

}
