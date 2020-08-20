package java_swing.example4;

import java_swing.example4.model.Robot;
import java_swing.example4.ui.RobotFrame;
import javax.swing.JFrame;

public class DrawRobotPathMain {
    public static void main(String[] args) {
        // Количество сторон многоугольника
        final int COUNT = 12;
        // Длина стороны
        final int SIDE = 100;

        Robot robot = new Robot(200, 50);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        // Создаем форму для отрисовки пути нашего робота
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
