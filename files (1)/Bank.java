import java.util.*;

public class Bank {
    private Map<String, User> users;

    public Bank() {
        users = new HashMap<>();
        // Preload with some users (for demo)
        users.put("user1", new User("user1", "1234", 1000));
        users.put("user2", new User("user2", "5678", 2000));
    }

    public User authenticate(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.getPin().equals(pin)) return user;
        return null;
    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}