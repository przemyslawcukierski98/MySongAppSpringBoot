package pl.pcukierski.demo.dao;

import lombok.Data;

@Data
public class UserDAO {
    private String firstName;
    private String surname;
    private String email;
    private String password;
    private boolean admin;
}
