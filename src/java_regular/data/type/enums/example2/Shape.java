package java_regular.data.type.enums.example2;

public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;

    public double getSquare(double x, double y) {
        double result = 0;

        switch(this) {
            case RECTANGLE:
                result = x * y;
                break;
            case TRIANGLE:
                result = (x * y) / 2;
                break;
            case CIRCLE:
                result = Math.pow(x, 2) * Math.PI;
                break;
            default: new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }

        return result;
    }
}
