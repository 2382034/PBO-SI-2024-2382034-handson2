import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        //buatlah  sebuah program yang mengambil 2 input number dari user
        //program tersebut akan print out nilai yang paling besar
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Masukkan nilai a: ");
        a = scanner.nextInt();
        System.out.println("Masukkan nilai b: ");
        b = scanner.nextInt();

        if(a > b){
            System.out.println("angka "+a+" lebih besar daripada "+b);
        } else if (b > a) {
            System.out.println("angka "+b+" lebih besar daripada "+a);
        } else {
            System.out.println("Kedua Angka Sama");
            System.exit(0);
        }

    }
}
