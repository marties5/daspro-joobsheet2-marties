import java.util.Scanner;

public class javaBank21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tabungan_awal, lama_menabung;
        double tabungan_akhir, bunga, prosentase_bunga = 0.02;

        System.out.println("======================================");
        System.out.print("Masukkan Jumlah tabungan awal anda : ");
        tabungan_awal = input.nextInt();
        System.out.print("masukan dalam bentuk hari!!");
        System.out.print("Berapa lama anda menabung  ? : ");
        lama_menabung = input.nextInt();
        bunga = lama_menabung * prosentase_bunga * tabungan_awal;
        tabungan_akhir = bunga + tabungan_awal;
        System.out.println("======================================");
        input.close();
        System.out.println("Prakiran hasil akhir tabungan anda : Rp." + tabungan_akhir);

    }
}
