package java_swing.example4.ui;

import java_swing.example4.component.RobotPathComponent;
import java_swing.example4.model.Robot;

import javax.swing.JFrame;

public class RobotFrame extends JFrame {
    public RobotFrame(Robot robot) {
        // Устанавливаем заголовок окна
        setTitle("Robot Frame");
        // Добавляем компонент для рисования пути робота
        add(new RobotPathComponent(robot));
        // Устанавливаем размеры окна
        setBounds(100, 100, 500, 500);
    }
}
