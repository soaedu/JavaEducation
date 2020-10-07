package design_pattern.creational.prototype.example1.human;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public Human makeCopy() {
        return (Human) human.copy();
    }
}
