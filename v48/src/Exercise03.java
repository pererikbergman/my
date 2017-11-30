import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise03 {

    private static final int GAME_QUIT = 0;
    private static final int GAME_MENU = 1;
    private static final int GAME_RUNNING = 2;

    private Exercise03() {
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
        System.out.println("====================");
        System.out.println("| Exercise03 the number |");
        System.out.println("====================");
        System.out.println("| Option:          |");
        System.out.println("|    1. New game   |");
        System.out.println("|    0. Quit       |");
        System.out.println("====================");

        System.out.print("Select option: ");

        int input = getInput();

        if (input == 0) {
            return GAME_QUIT;
        } else if (input == 1) {
            return GAME_RUNNING;
        } else {
            return GAME_MENU;
        }
    }

    private int drawInGame() {
        int secretNumber = new Random().nextInt(100);
        int numOfTries = 0;

        do {
            System.out.print("\nExercise03 a number between 0 and 100: ");
            int input = getInput();
            numOfTries++;
            if (input == secretNumber) {
                System.out.println("Congratulation you guessed the number in " + numOfTries + " tries!");
                return GAME_MENU;
            } else if (input < secretNumber) {
                System.out.print("To low, guess again: ");
            } else if (input > secretNumber) {
                System.out.print("To high, guess again: ");
            }
        } while (true);
    }

    private int drawGameOver() {
        System.out.println("Game Over");
        return getInput();
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
        Exercise03 exercise03 = new Exercise03();
    }
}
