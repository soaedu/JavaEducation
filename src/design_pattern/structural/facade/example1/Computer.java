package design_pattern.structural.facade.example1;

import design_pattern.structural.facade.example1.parts.DVDRom;
import design_pattern.structural.facade.example1.parts.HDD;
import design_pattern.structural.facade.example1.parts.Power;

public class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copyDataFromDisk() {
        power.powerOn();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
