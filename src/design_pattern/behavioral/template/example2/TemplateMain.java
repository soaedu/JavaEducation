package design_pattern.behavioral.template.example2;

public class TemplateMain {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
