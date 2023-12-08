package DB;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DBTest extends DBSteps {
    @BeforeMethod
    public void ConnectDB() throws SQLException {
        connectDB();
    }
    @Test
    public void DBExecuteAddUpdateGet() throws SQLException {
        String username = "\'Alex\'";
        String usernameUpdate = "\'Peter\'";
        String usernameUpdated = "Peter";

        InsertToTable(username, 29);
        UpdateTable(username, usernameUpdate);
         assertThat(SelectUserFromTable(usernameUpdate)).isEqualTo(usernameUpdated);

    }
    @Test
    public void DBExecuteAddDelSearch() throws SQLException{
        String username = "\'Alice\'";
        String usernameUpdate = "";

        InsertToTable(username, 25);
        DeleteUser(username);
        assertThat(SearchUserFromTable(username)).isEqualTo(usernameUpdate);
    }
}
