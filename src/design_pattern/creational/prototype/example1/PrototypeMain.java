package design_pattern.creational.prototype.example1;

import design_pattern.creational.prototype.example1.human.Human;
import design_pattern.creational.prototype.example1.human.HumanFactory;

public class PrototypeMain {
    public static void main(String[] args) {
        Human human = new Human(18, "Вася");
        System.out.println(human);

        Human humanCopy1 = (Human) human.copy();
        System.out.println(humanCopy1);

        HumanFactory factory = new HumanFactory(human);
        Human humanCopy2 = factory.makeCopy();
        System.out.println(humanCopy2);
    }
}
