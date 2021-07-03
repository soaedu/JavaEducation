package java_regular.data.type.classes.type.nested.example2;

import java.io.Serializable;

interface State extends Serializable {}
interface View {
    State getCurrentState();
    void restoreState(State state);
}

/**
 * Почему при попытке сериализовать состояние кнопки возникает исключение "java.io.NotSerializableException: Button"?
 * На первый взгляд это может показаться странным: сериализуемая переменная имеет тип ButtonState, а не Button.
 *
 * Когда в Java один класс объявляется внутри другого, он по умолчанию становится внутренним классом.
 * В данном случае класс ButtonState будет неявно хранить ссылку на внешний класс Button.
 * Это объясняет, почему ButtonState не может быть сериализован: класс Button не сериализуется, а ссылка на него
 * препятствует сериализации ButtonState.
 *
 * Чтобы устранить эту проблему, нужно сделать класс ButtonState статическим, добавив модификатор static.
 * Объявление вложенного класса статическим удаляет неявную ссылку на внешнии класс.
 */
public class Button implements View {
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {
        /* ... */
    }

    // public class ButtonState implements State {
    public static class ButtonState implements State {
        /* ... */
    }
}
