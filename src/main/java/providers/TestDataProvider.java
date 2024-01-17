package providers;

import pojos.user.User;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class TestDataProvider {

    private final String authDirectory = "src/test/resources/testData/auth/";

    public User getUser(Class clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;
        try {
            user = objectMapper.readValue(new File(authDirectory + clazz.getSimpleName() + ".json"), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
