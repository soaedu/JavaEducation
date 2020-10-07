package design_pattern.creational.abstract_factory.example1.device.mouse;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        String message = "";

        if (direction > 0) {
            message = "Scroll up";
        } else if (direction < 0){
            message = "Scroll down";
        } else {
            message = "No scrolling";
        }

        System.out.println(message);
    }
}
