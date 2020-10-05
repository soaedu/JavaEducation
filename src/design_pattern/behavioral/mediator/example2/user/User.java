package design_pattern.behavioral.mediator.example2.user;

import design_pattern.behavioral.mediator.example2.chat.Chat;

public abstract class User {
    Chat chat;
    String name;
    boolean isEnabled = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + "'}";
    }
}
