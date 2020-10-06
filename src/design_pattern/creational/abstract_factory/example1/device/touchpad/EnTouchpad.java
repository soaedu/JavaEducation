package design_pattern.creational.abstract_factory.example1.device.touchpad;

public class EnTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved on " + s + " pixels");
    }
}
