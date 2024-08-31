package jordanrowland.fakebook.config;

import jordanrowland.fakebook.model.User;
import jordanrowland.fakebook.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class DataLoader {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userRepository.saveAll(List.of(
                new User("Djavid"),
                new User("Slimjob Dopamine"),
                new User("Kevin Tipcorn"),
                new User("Timmy Towers")
        ));
    }
}
