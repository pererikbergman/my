import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03_Template {

    private static final int GAME_QUIT = 0;
    private static final int GAME_MENU = 1;
    private static final int GAME_RUNNING = 2;

    private Exercise03_Template() {
        int state = GAME_MENU;
        while (state != GAME_QUIT) {
            switch (state) {
                case GAME_MENU:
                    state = drawMenu();
                    break;

                case GAME_RUNNING:
                    state = drawInGame();
                    break;

                default:
                    System.out.println("Unknown state.");
                    state = GAME_QUIT;
            }
        }
    }

    private int drawMenu() {
         return GAME_MENU;
    }

    private int drawInGame() {
        return GAME_MENU;
    }

    private int drawGameOver() {
        return GAME_MENU;
    }

    private int getInput() {
        Scanner in = new Scanner(System.in);
        int n = -1;
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            // Wrong input type
        }

        return n;
    }

    public static void main(String[] args) {
        Exercise03_Template exercise03 = new Exercise03_Template();
    }
}
