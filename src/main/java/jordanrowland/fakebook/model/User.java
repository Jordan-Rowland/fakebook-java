package jordanrowland.fakebook.model;

import jakarta.persistence.*;

@Entity()
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;

    public User() {}
    public User(String username) { this.username = username; }

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username = username;
    }
}
