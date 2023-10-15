package api;
import api.steps.UserSteps;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserTest {
    UserSteps userSteps = new UserSteps();

    @Test
     void shouldBeCreateUser(){

        var response = userSteps.createUser();
        System.out.println(response.statusCode());
        assertThat(response.statusCode())
                .as("The status code is not equal 200")
                .isEqualTo(200);

    }
}
