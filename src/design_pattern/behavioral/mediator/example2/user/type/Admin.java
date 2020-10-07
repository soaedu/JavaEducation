package design_pattern.behavioral.mediator.example2.user.type;

import design_pattern.behavioral.mediator.example2.chat.Chat;
import design_pattern.behavioral.mediator.example2.user.User;

public class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin '" +getName()+ "' receives message '" +message+ "'");
    }
}
