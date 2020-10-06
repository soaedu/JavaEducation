package design_pattern.behavioral.visitor.example2.computer_part;

import design_pattern.behavioral.visitor.example2.visitor.ComputerPartVisitor;

// Element
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
