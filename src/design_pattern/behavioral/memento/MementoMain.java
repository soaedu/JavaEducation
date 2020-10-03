package design_pattern.behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("Level#1", 30000);
        System.out.println(game);

        // save game
        File file = new File();
        file.setSave(game.save());

        game.set("Level#2", 80000);
        System.out.println(game);

        // return to first save
        game.load(file.getSave());
        System.out.println("Load save...");
        System.out.println(game);
    }
}
