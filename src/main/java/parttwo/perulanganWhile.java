package parttwo;
import java.util.Scanner;

public class perulanganWhile {

    private static String jawab;
    private static java.lang.String String;

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Are you ready? ");
            String ulangi = scanner.nextLine();
            System.out.println("Start");
            int counter = 0;

            while (ulangi.equals("1") || ulangi.equalsIgnoreCase(
                    System.out.print("Apakah anda mau mengulang? (yes"/
                            String jawab = scanner.nextLine();
            counter++;

            if (!jawab.equalsIgnoreCase("yes")) {
                ulangi = "0";
            }
            System.out.println("Pengulangan ke-" + counter);

        }
}

