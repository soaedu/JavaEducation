package design_pattern.behavioral.visitor.auto_part.type;

import design_pattern.behavioral.visitor.visitor.Visitor;
import design_pattern.behavioral.visitor.auto_part.AutoPart;

// Concrete Element
// Двигатель
public class EngineAutoPart implements AutoPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
