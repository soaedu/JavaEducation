package design_pattern.behavioral.visitor.example1;

import design_pattern.behavioral.visitor.example1.auto_part.AutoPart;
import design_pattern.behavioral.visitor.example1.auto_part.type.Car;
import design_pattern.behavioral.visitor.example1.visitor.type.DestroyVisitor;
import design_pattern.behavioral.visitor.example1.visitor.type.RepairVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        /*Visitor destroyVisitor = new DestroyVisitor();
        Visitor repairVisitor = new RepairVisitor();

        AutoPart body = new BodyAutoPart();
        body.accept(destroyVisitor);
        body.accept(repairVisitor);

        AutoPart engine = new EngineAutoPart();
        engine.accept(destroyVisitor);
        engine.accept(repairVisitor);*/

        AutoPart car = new Car();
        car.accept(new DestroyVisitor());
        System.out.println();
        car.accept(new RepairVisitor());
    }
}
