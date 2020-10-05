package design_pattern.behavioral.visitor.auto_part.type;

import design_pattern.behavioral.visitor.auto_part.AutoPart;
import design_pattern.behavioral.visitor.visitor.Visitor;

// Concrete Element
// Колесо
public class WheelAutoPart implements AutoPart {
    private String name;

    public WheelAutoPart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
