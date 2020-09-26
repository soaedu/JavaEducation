package design_pattern.creational.abstract_factory.device;

import design_pattern.creational.abstract_factory.device.keyboard.EnKeyboard;
import design_pattern.creational.abstract_factory.device.keyboard.Keyboard;
import design_pattern.creational.abstract_factory.device.mouse.EnMouse;
import design_pattern.creational.abstract_factory.device.mouse.Mouse;
import design_pattern.creational.abstract_factory.device.touchpad.EnTouchpad;
import design_pattern.creational.abstract_factory.device.touchpad.Touchpad;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
