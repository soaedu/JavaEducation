package design_pattern.behavioral.visitor.example2.computer_part.type;

import design_pattern.behavioral.visitor.example2.computer_part.ComputerPart;
import design_pattern.behavioral.visitor.example2.visitor.ComputerPartVisitor;

// Concrete Element
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0; i<parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
