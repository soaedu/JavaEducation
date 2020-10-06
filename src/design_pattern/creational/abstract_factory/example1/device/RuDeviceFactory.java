package design_pattern.creational.abstract_factory.example1.device;

import design_pattern.creational.abstract_factory.example1.device.keyboard.Keyboard;
import design_pattern.creational.abstract_factory.example1.device.keyboard.RuKeyboard;
import design_pattern.creational.abstract_factory.example1.device.mouse.Mouse;
import design_pattern.creational.abstract_factory.example1.device.mouse.RuMouse;
import design_pattern.creational.abstract_factory.example1.device.touchpad.RuTouchpad;
import design_pattern.creational.abstract_factory.example1.device.touchpad.Touchpad;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
