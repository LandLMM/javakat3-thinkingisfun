package pl.sdacademy.thinkingisfun.ut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseInformationServiceTest {

    @Mock
    private DatabaseConnection dbConnection;

    @Test
    public void shouldUpdateUserName() {
        Long userId = 12L;
        String newUserName = "Bozydar";
        User mockedUserFromDatabase = mock(User.class);
        when(dbConnection.getUserById(eq(userId))).thenReturn(mockedUserFromDatabase);

        DatabaseInformationService service = new DatabaseInformationService(dbConnection);
        service.updateUserName(userId, newUserName);

        verify(mockedUserFromDatabase).setName(eq(newUserName));
    }

    @Test
    public void shouldSaveUpdatedByIdUsername() {
        /* ??? */
        User mockedUserFromDatabase = mock(User.class);
        /* ??? */
        verify(dbConnection).save(eq(mockedUserFromDatabase));
    }

    @Test
    public void shouldUpdateUserAge() {

    }

    @Test
    public void shouldFetchAllUsersWithName() {
        /* ??? */

        DatabaseInformationService service = new DatabaseInformationService(dbConnection);
        List<User> users = service.fetchUsersWithName("");

        assertEquals(3, users.size());
    }

    @Test
    public void shouldUpdateAllUserName() {
    }

    @Test
    public void shouldSaveAllUpdatedByNameUsers() {
    }

}