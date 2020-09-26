package design_pattern.structural.facade;

import design_pattern.structural.facade.parts.DVDRom;
import design_pattern.structural.facade.parts.HDD;
import design_pattern.structural.facade.parts.Power;

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
