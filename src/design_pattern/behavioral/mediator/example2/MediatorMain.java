package design_pattern.behavioral.mediator.example2;

import design_pattern.behavioral.mediator.example2.user.User;
import design_pattern.behavioral.mediator.example2.user.type.Admin;
import design_pattern.behavioral.mediator.example2.chat.type.TextChat;
import design_pattern.behavioral.mediator.example2.user.type.SimpleUser;

public class MediatorMain {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin(textChat, "Admin");
        textChat.setAdmin(admin);

        User user1 = new SimpleUser(textChat, "Bob");
        textChat.addUser(user1);

        User user2 = new SimpleUser(textChat, "Jack");
        user2.setIsEnabled(false);
        textChat.addUser(user2);

        User user3 = new SimpleUser(textChat, "Masha");
        textChat.addUser(user3);

        user1.sendMessage("Hey everyone!");

        System.out.println();
        admin.sendMessage("Quiet!!!");
    }
}
