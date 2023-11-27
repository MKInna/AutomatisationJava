package api;
import api.dto.request.UserBuilder;
import api.steps.UserSteps;
import lombok.var;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class UserTest {
    UserSteps userSteps = new UserSteps();
    private final UserBuilder user = UserBuilder.builder()
            .id(0)
            .username("Alex")
            .build();

    @Test
     void CreateUser(){

         userSteps.createUser(user);
         var username = userSteps.getUser(user.getUsername());
         user.setUsername("Alex1");
         user.setId(2);
         userSteps.updateUser("Alex", user);
         userSteps.getUser(user.getUsername());
         userSteps.deleteUser(user.getUsername());
        var checkUser=userSteps.getUser(user.getUsername(), user);

        assertThat(checkUser.getUsername()).as("Username is not delete")
                .isEqualTo(null);

/*
        var response1 = userSteps.getUser();
        System.out.println(response1);
          assertThat(response1)
                .as("The username is wrong")
                .isEqualTo("Alex");*/


    }
}
