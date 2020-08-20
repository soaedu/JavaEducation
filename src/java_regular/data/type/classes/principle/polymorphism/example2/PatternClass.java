package java_regular.data.type.classes.principle.polymorphism.example2;

public class PatternClass {
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    public void display(char symbol) {
        for(int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}
