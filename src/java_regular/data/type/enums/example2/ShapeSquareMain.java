package java_regular.data.type.enums.example2;

public class ShapeSquareMain {
    public static void main(String[] args) {
        double x=2, y=3;

        Shape[] shapeArr = Shape.values();

        // name(), ordinal(), getSquare()
        for(Shape shape : shapeArr) {
            System.out.printf("\nShape: %s" +
                    "\n\thas name: %s " +
                    "\n\tis in position: %d and" +
                    "\n\thas square = %5.2f%n", shape, shape.name(), shape.ordinal(), shape.getSquare(x, y));
        }
    }
}
