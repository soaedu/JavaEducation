package design_pattern.behavioral.mediator.example1.chat.type;

import design_pattern.behavioral.mediator.example1.user.User;
import design_pattern.behavioral.mediator.example1.chat.Chat;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User receiver: users) {
            receiver.getMessage(message);
        }
        admin.getMessage(message);
    }
}
