package jordanrowland.fakebook.repository;

import jordanrowland.fakebook.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM users;", nativeQuery = true)
    public Iterable<User> findAll();

    @Query(value = "SELECT * FROM users WHERE username = ?1;", nativeQuery = true)
    public Optional<User> findByUsername(String username);
}
