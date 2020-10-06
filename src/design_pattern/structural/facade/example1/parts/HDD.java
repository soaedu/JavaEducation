package design_pattern.structural.facade.example1.parts;

public class HDD {
    public void copyFromDVD(DVDRom dvd) {
        String message ="";

        if (dvd.hasData()) {
            message = "Data is copying from the disk...";
        } else {
            message = "Insert disk with data.";
        }

        System.out.println(message);
    }
}
