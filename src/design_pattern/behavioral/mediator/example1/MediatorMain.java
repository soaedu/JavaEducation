package design_pattern.behavioral.mediator.example1;

import design_pattern.behavioral.mediator.example1.chat.type.TextChat;
import design_pattern.behavioral.mediator.example1.user.User;
import design_pattern.behavioral.mediator.example1.user.type.Admin;
import design_pattern.behavioral.mediator.example1.user.type.SimpleUser;

public class MediatorMain {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin(textChat);
        textChat.setAdmin(admin);

        User user1 = new SimpleUser(textChat);
        textChat.addUser(user1);

        User user2 = new SimpleUser(textChat);
        textChat.addUser(user2);

        user1.sendMessage("Hey I am the user#1");
        admin.sendMessage("Admin is in the chat.");
    }
}
