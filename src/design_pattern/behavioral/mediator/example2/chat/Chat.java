package design_pattern.behavioral.mediator.example2.chat;

import design_pattern.behavioral.mediator.example2.user.User;

// Mediator
public interface Chat {
    void sendMessage(String message, User user);
}
