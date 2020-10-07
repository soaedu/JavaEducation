package design_pattern.behavioral.visitor.example2.visitor;

import design_pattern.behavioral.visitor.example2.computer_part.type.Computer;
import design_pattern.behavioral.visitor.example2.computer_part.type.Keyboard;
import design_pattern.behavioral.visitor.example2.computer_part.type.Monitor;
import design_pattern.behavioral.visitor.example2.computer_part.type.Mouse;

// Concrete Visitor
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}
