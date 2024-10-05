import java.util.Scanner;

public class Pemilihan2Percobaan1_02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.println("Masukkan tahun:");
        int tahun = input02.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " adalah tahun kabisat");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat");
                }
            } else {
                System.out.println(tahun + " adalah tahun kabisat");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        input02.close();
    }
}