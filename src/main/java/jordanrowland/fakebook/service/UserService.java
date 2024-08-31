package jordanrowland.fakebook.service;

import jordanrowland.fakebook.model.User;
import jordanrowland.fakebook.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User u) {
        var existing_user = userRepository.findByUsername(u.getUsername());
        // Change this to an exception
        if (existing_user.isPresent()) { return null; }
        return userRepository.save(u);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public User updateUser(int id, User u) {
        var res = getUser(id);
        if (res.isEmpty()) { return null; }
        var existing_user = userRepository.findByUsername(u.getUsername());
        // Change this to an exception
        if (existing_user.isPresent()) { return null; }
        u.setId(id);
        return userRepository.save(u);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
