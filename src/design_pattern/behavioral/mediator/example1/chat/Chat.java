package design_pattern.behavioral.mediator.example1.chat;

import design_pattern.behavioral.mediator.example1.user.User;

// Mediator
public interface Chat {
    void sendMessage(String message, User user);
}
