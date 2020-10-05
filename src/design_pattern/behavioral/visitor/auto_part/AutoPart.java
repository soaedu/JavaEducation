package design_pattern.behavioral.visitor.auto_part;

import design_pattern.behavioral.visitor.visitor.Visitor;

// Element
public interface AutoPart {
    void accept(Visitor visitor);
}
