package desafios.cadastro;

import java.util.List;
import java.util.ArrayList;

public class Account {
    private List<User> user;

    public Account() {
        user = new ArrayList<>();
    }

    public void registerUser(String userName, String password) {
        user.add(new User(userName, password));
    }

    public void login(String userName, String password) {
        
    }
}