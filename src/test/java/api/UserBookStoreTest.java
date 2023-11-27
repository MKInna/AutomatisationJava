package api;

import api.steps.UserBookStoreSteps;
import lombok.var;
import org.testng.annotations.Test;

public class UserBookStoreTest {
    UserBookStoreSteps user = new UserBookStoreSteps();
    @Test
    void getUserWithBook(){
       user.addBook();
        var response = user.getUser();
        System.out.println(response.getBooks().get(0).getTitle());
        user.deleteBook();

    }

}
