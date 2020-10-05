package design_pattern.behavioral.mediator.example2.chat.type;

import design_pattern.behavioral.mediator.example2.chat.Chat;
import design_pattern.behavioral.mediator.example2.user.User;
import design_pattern.behavioral.mediator.example2.user.type.Admin;
import design_pattern.behavioral.mediator.example2.user.type.SimpleUser;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough rights");
        }

        this.admin = admin;
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("The chat has no admin");
        }

        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can not enter in the other chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User receiver: users) {
                receiver.getMessage(user.getName() + ": " +message);
            }
        }

        if (user instanceof SimpleUser) {
            for (User receiver: users) {
                if (receiver != user && receiver.isEnabled()) {
                    receiver.getMessage(user.getName() + ": " + message);
                }
            }

            if (admin.isEnabled()) {
                admin.getMessage(user.getName() + ": " +message);
            }
        }
    }
}
