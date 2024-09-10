import java.util.Scanner;

public class javaSegitiga21 {
    public static void main(String[] args) {

        float luasSegitiga;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih satuan : ");
        String namaSatuan = scanner.nextLine();
        System.out.print("Masukan Alas segitiga : ");
        int alasSegitiga = scanner.nextInt();
        System.out.print("Masukan Tinggi segitiga : ");
        int tinggiSegitiga = scanner.nextInt();
        scanner.close();
        luasSegitiga = alasSegitiga * tinggiSegitiga / 2;
        System.out.println("========================");
        System.out.println("Hasil dari penjumlahan adalah : " + luasSegitiga + " " + namaSatuan.toUpperCase());

    }
}