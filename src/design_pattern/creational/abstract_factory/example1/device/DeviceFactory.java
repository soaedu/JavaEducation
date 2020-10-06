package design_pattern.creational.abstract_factory.example1.device;

import design_pattern.creational.abstract_factory.example1.device.keyboard.Keyboard;
import design_pattern.creational.abstract_factory.example1.device.mouse.Mouse;
import design_pattern.creational.abstract_factory.example1.device.touchpad.Touchpad;

public interface DeviceFactory {
    Keyboard getKeyboard();
    Mouse getMouse();
    Touchpad getTouchpad();
}
