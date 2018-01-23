package pl.sdacademy.thinkingisfun.ut;

import java.util.List;

public interface DatabaseConnection {

    User getUserById(Long id);
    List<User> getUsersByName(String name);
    void save(User userToBeSaved);
}
