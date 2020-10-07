package design_pattern.behavioral.visitor.example2.computer_part.type;

import design_pattern.behavioral.visitor.example2.computer_part.ComputerPart;
import design_pattern.behavioral.visitor.example2.visitor.ComputerPartVisitor;

// Concrete Element
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
