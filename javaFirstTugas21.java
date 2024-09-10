import java.util.Scanner;;

public class javaFirstTugas21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka_pertama, angka_kedua;
        System.out.println("================================");
        System.out.println(" KALKULATOR SEDERHANA 2 VARIABEL");
        System.out.println("================================");

        System.out.print("Nilai pertama : ");
        angka_pertama = input.nextInt();

        System.out.print("Nilai kedua : ");
        angka_kedua = input.nextInt();

        System.out
                .println("Hasil dari penjumlahan " + angka_pertama + " + " + angka_kedua + " Adalah : " + angka_pertama
                        + angka_kedua);
        input.close();

    }
}