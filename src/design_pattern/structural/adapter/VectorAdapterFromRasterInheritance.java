package design_pattern.structural.adapter;

public class VectorAdapterFromRasterInheritance extends RasterGraphics implements VectorGraphics {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
