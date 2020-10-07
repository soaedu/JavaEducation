package design_pattern.behavioral.mediator.example2.user.type;

import design_pattern.behavioral.mediator.example2.chat.Chat;
import design_pattern.behavioral.mediator.example2.user.User;

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Simple user '" +getName()+ "' receives message '" +message+ "'");
    }
}
