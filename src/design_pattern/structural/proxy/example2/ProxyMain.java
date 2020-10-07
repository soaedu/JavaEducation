package design_pattern.structural.proxy.example2;

import design_pattern.structural.proxy.example2.proxy.Image;
import design_pattern.structural.proxy.example2.proxy.ProxyImage;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
