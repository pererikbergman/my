import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        do {
            System.out.print("Välj en dag med 1-7, välj 0 för att avsluta: ");
            int day = in.nextInt();
            switch (day) {
                case 0:
                    System.out.println("Avslutade");
                    running = false;
                    break;
                case 1:
                    System.out.println("Måndag");
                    break;
                case 2:
                    System.out.println("Tisdag");
                    break;
                case 3:
                    System.out.println("Onsdag");
                    break;
                case 4:
                    System.out.println("Torsdag");
                    break;
                case 5:
                    System.out.println("Fredag");
                    break;
                case 6:
                    System.out.println("Lördag");
                    break;
                case 7:
                    System.out.println("Söndag");
                    break;
            }
        } while (running);
    }
}
