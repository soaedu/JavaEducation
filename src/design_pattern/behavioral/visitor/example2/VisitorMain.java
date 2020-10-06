package design_pattern.behavioral.visitor.example2;

import design_pattern.behavioral.visitor.example2.computer_part.ComputerPart;
import design_pattern.behavioral.visitor.example2.computer_part.type.Computer;
import design_pattern.behavioral.visitor.example2.visitor.ComputerPartDisplayVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
