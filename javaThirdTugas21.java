import java.util.Scanner;

public class javaThirdTugas21 {

    public static void main(String[] args) {
        int saldo_awal = 1000000000, jumlah_transaksi;
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("\tATM BERSAMA ");
        System.out.println("================================");

        System.out.println("Saldo anda : " + saldo_awal);
        System.out.print("Masukaan Jumlah Transaksi : ");
        jumlah_transaksi = input.nextInt();

        System.out.println("Uang yang anda ambil : " + jumlah_transaksi);

        System.out.println("Sisa Saldo anda : " + (saldo_awal - jumlah_transaksi));
        input.close();
    }
}