package design_pattern.behavioral.visitor.example1.auto_part.type;

import design_pattern.behavioral.visitor.example1.visitor.Visitor;
import design_pattern.behavioral.visitor.example1.auto_part.AutoPart;

// Concrete Element
// Кузов
public class BodyAutoPart implements AutoPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
