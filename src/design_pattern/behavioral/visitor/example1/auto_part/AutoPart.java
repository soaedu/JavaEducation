package design_pattern.behavioral.visitor.example1.auto_part;

import design_pattern.behavioral.visitor.example1.visitor.Visitor;

// Element
public interface AutoPart {
    void accept(Visitor visitor);
}
