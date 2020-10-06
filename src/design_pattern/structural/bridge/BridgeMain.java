package design_pattern.structural.bridge;

import design_pattern.structural.bridge.brand.type.Kia;
import design_pattern.structural.bridge.brand.type.Opel;
import design_pattern.structural.bridge.brand.type.Skoda;
import design_pattern.structural.bridge.car.Car;
import design_pattern.structural.bridge.car.type.Hatchback;
import design_pattern.structural.bridge.car.type.Sedan;

public class BridgeMain {
    public static void main(String[] args) {
        Car kiaSedan = new Sedan(new Kia());
        kiaSedan.showDetails();

        System.out.println();

        Car kiaHatchback = new Hatchback(new Kia());
        kiaHatchback.showDetails();

        System.out.println();

        Car skodaHatchback = new Hatchback(new Skoda());
        skodaHatchback.showDetails();

        System.out.println();

        Car opelHatchback = new Hatchback(new Opel());
        opelHatchback.showDetails();
    }
}
