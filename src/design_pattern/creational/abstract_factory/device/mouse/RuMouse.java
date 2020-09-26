package design_pattern.creational.abstract_factory.device.mouse;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        String message = "";

        if (direction > 0) {
            message = "Сколлим вверх";
        } else if (direction < 0){
            message = "Сколлим вниз";
        } else {
            message = "Не сколлим";
        }

        System.out.println(message);
    }
}
