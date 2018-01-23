package pl.sdacademy.thinkingisfun.ut;

import java.util.List;

public class DatabaseInformationService {

    private final DatabaseConnection dbConnection;

    public DatabaseInformationService(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void updateUserName(Long userId, String newName) {
        User userFromDb = dbConnection.getUserById(userId);
        userFromDb.setName(newName);
        dbConnection.save(userFromDb);
    }

    public void updateUserAge(Long userId, Integer newAge) {
        User userFromDb = dbConnection.getUserById(userId);
        userFromDb.setAge(newAge);
        dbConnection.save(userFromDb);
    }

    public List<User> fetchUsersWithName(String name) {
        return dbConnection.getUsersByName(name);
    }

    public void changeAllUsersName(String oldName, String newName) {
        List<User> usersByName = dbConnection.getUsersByName(oldName);
        for (User user : usersByName) {
            user.setName(newName);
            dbConnection.save(user);
        }
    }
}
