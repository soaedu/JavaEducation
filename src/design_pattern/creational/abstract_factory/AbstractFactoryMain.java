package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.device.DeviceFactory;
import design_pattern.creational.abstract_factory.device.EnDeviceFactory;
import design_pattern.creational.abstract_factory.device.RuDeviceFactory;
import design_pattern.creational.abstract_factory.device.keyboard.Keyboard;
import design_pattern.creational.abstract_factory.device.mouse.Mouse;
import design_pattern.creational.abstract_factory.device.touchpad.Touchpad;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        // изменяемые строки
        // DeviceFactory deviceFactory = getDeviceFactoryBy("RU");
        // DeviceFactory deviceFactory = getDeviceFactoryBy("En");
        DeviceFactory deviceFactory = getDeviceFactoryBy("Fr");

        // неизменяемые строки
        Mouse mouse = deviceFactory.getMouse();
        mouse.click();

        Keyboard keyboard = deviceFactory.getKeyboard();
        keyboard.print();
        keyboard.println();

        Touchpad touchpad = deviceFactory.getTouchpad();
        touchpad.track(10, 35);
    }

    public static DeviceFactory getDeviceFactoryBy(String countryCode) {
        return switch (countryCode.toLowerCase()) {
            case "ru" -> new RuDeviceFactory();
            case "en" -> new EnDeviceFactory();
            default -> throw new RuntimeException("Unsupported country code: " +countryCode);
        };
    }
}
