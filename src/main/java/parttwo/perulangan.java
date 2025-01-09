package parttwo;
import java.util.Scanner;

public class perulangan {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String Password = prompt("Enter Paswword : ");
        String validPassword = "password";
        if (Password.equals(validPassword)){
            System.out.println("Selamat datang Bos");
        }else {
            System.out.println("Password Salah silahkan Login kembali");
        }
        System.out.println("Terima Kasih Sudah Login Menggunakan Aplikasi Kami");
    }

    public static String prompt(String enterPaswword) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(enterPaswword);
        return scanner.nextLine();
    }
}
