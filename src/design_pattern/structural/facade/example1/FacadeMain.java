package design_pattern.structural.facade.example1;

public class FacadeMain {
    public static void main(String[] args) {
        // #1
        /*Power power = new Power();
        power.powerOn();

        DVDRom dvd = new DVDRom();
        dvd.load();

        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);*/

        // #2 Facade
        Computer computer = new Computer();
        computer.copyDataFromDisk();
    }
}
