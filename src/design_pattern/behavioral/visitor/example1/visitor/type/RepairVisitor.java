package design_pattern.behavioral.visitor.example1.visitor.type;

import design_pattern.behavioral.visitor.example1.auto_part.type.BodyAutoPart;
import design_pattern.behavioral.visitor.example1.auto_part.type.Car;
import design_pattern.behavioral.visitor.example1.auto_part.type.EngineAutoPart;
import design_pattern.behavioral.visitor.example1.auto_part.type.WheelAutoPart;
import design_pattern.behavioral.visitor.example1.visitor.Visitor;

// Concrete Visitor
public class RepairVisitor implements Visitor {
    @Override
    public void visit(EngineAutoPart engine) {
        System.out.println("Checked the engine");
    }

    @Override
    public void visit(BodyAutoPart body) {
        System.out.println("Fixed the crumpled wing");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Ventilated the car");
    }

    @Override
    public void visit(WheelAutoPart wheel) {
        System.out.println("Glued the " +wheel.getName()+ " wheel");
    }
}
