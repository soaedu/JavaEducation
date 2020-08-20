package java_swing.example2;

import javax.swing.JFrame;

public class DrawOvalMain {
    public static void main(String[] args) {
        // Создаем графическое окно
        OvalFrame of = new OvalFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}
