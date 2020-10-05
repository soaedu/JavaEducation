package design_pattern.behavioral.mediator.example1.user.type;

import design_pattern.behavioral.mediator.example1.chat.Chat;
import design_pattern.behavioral.mediator.example1.user.User;

// Concrete client
public class Admin implements User {
    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin receives a message '" +message+ "'");
    }
}
