package design_pattern.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        // 1 способ: через наследование
        VectorGraphics graphics1 = new VectorAdapterFromRasterInheritance();
        graphics1.drawLine();
        graphics1.drawSquare();

        // 2 способ: через композицию
        VectorGraphics graphics2 = new VectorAdapterFromRasterComposition();
        graphics2.drawLine();
        graphics2.drawSquare();
    }
}
