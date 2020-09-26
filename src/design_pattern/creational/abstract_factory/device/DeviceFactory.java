package design_pattern.creational.abstract_factory.device;

import design_pattern.creational.abstract_factory.device.keyboard.Keyboard;
import design_pattern.creational.abstract_factory.device.mouse.Mouse;
import design_pattern.creational.abstract_factory.device.touchpad.Touchpad;

public interface DeviceFactory {
    Keyboard getKeyboard();
    Mouse getMouse();
    Touchpad getTouchpad();
}
