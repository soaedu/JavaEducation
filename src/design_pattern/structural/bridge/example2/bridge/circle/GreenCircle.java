package design_pattern.structural.bridge.example2.bridge.circle;

import design_pattern.structural.bridge.example2.bridge.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " +radius+ ", x: " +x+ ", y:  " +y+ " ]");
    }
}
