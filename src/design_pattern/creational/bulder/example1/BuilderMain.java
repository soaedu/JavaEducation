package design_pattern.creational.bulder.example1;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setBrand("Reno")
                .setTransmission(Transmission.AUTO)
                .setMaxSpeed(150)
                .build();

        System.out.println(car);
    }
}
