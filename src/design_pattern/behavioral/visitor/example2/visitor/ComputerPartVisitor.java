package design_pattern.behavioral.visitor.example2.visitor;

import design_pattern.behavioral.visitor.example2.computer_part.type.Computer;
import design_pattern.behavioral.visitor.example2.computer_part.type.Keyboard;
import design_pattern.behavioral.visitor.example2.computer_part.type.Monitor;
import design_pattern.behavioral.visitor.example2.computer_part.type.Mouse;

// Visitor
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(Mouse mouse);
}
