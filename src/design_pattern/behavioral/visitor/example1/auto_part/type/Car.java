package design_pattern.behavioral.visitor.example1.auto_part.type;

import design_pattern.behavioral.visitor.example1.auto_part.AutoPart;
import design_pattern.behavioral.visitor.example1.visitor.Visitor;

// Concrete Element
// Машина
public class Car implements AutoPart {
    AutoPart[] autoParts;

    public Car() {
        this.autoParts = new AutoPart[] {
                new WheelAutoPart("front left"),
                new WheelAutoPart("front right"),
                new WheelAutoPart("back left"),
                new WheelAutoPart("back right"),
                new BodyAutoPart(),
                new EngineAutoPart()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for (AutoPart autoPart: autoParts) {
            autoPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
