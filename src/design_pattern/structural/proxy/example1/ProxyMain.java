package design_pattern.structural.proxy.example1;

import design_pattern.structural.proxy.example1.image.Image;
import design_pattern.structural.proxy.example1.image.ProxyImage;
import design_pattern.structural.proxy.example1.image.RealImage;

public class ProxyMain {
    public static void main(String[] args) {
        // image loading is in constructor
        Image realImage = new RealImage("/home/desktop/image.png");
        realImage.display();

        System.out.println();

        // image loading is in the method display() and will start only if method was called
        Image proxyImage = new ProxyImage("/home/desktop/image.png");
        proxyImage.display();
    }
}
