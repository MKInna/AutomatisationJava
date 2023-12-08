package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.hamcrest.MatcherAssert.assertThat;

public class DBSteps {

    ConnectToDriver connectToDriver = new ConnectToDriver();

    Statement statement = null;

    public void connectDB() throws SQLException {
        connectToDriver.connect();
    }

    public void SelectAllFromTable() throws SQLException {
        try {
            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM USERS");
            while (rs.next()) {
                String username = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(("username " + username));
                System.out.println("age " + age);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void InsertToTable(String name, int num) throws SQLException {
        try {

            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("INSERT INTO USERS (username, age) VALUES (" + name + ","+ num+")");
            System.out.println("The person added successfully");
            } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void UpdateTable(String name, String nameUpdate) throws SQLException {
        try {
            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("UPDATE USERS SET username= " + nameUpdate + " WHERE username= " + name );
            System.out.println("The person updated successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public String SelectUserFromTable(String usernameUpdate) throws SQLException {
        String username ="";
        try {
            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from USERS WHERE username LIKE " + usernameUpdate);

            while (rs.next()) {
                username = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(("username " + username));
                System.out.println("age " + age);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return username;

    }
    public void DeleteUser(String name) throws SQLException {
        try {
            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("DELETE FROM USERS WHERE username=" + name );
            System.out.println("The person deleted successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public String SearchUserFromTable(String name) throws SQLException {
        String username ="";
        try {
            statement = connectToDriver.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from USERS WHERE username LIKE " + name );

            while (rs.next()) {
                username = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(("username " + username));
                System.out.println("age " + age);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return username;

    }

}
