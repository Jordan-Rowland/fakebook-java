package jordanrowland.fakebook.controller;

import jordanrowland.fakebook.model.User;
import jordanrowland.fakebook.repository.UserRepository;
import jordanrowland.fakebook.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    Iterable<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    Optional<User> getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PutMapping("/users/{id}")
    User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
