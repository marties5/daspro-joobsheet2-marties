import java.util.Scanner;

public class javaSecondTugas21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Nilai_tugas, Nilai_UTS, Nilai_UAS;
        System.out.println("==================================");
        System.out.println("MENGHITUNG NILAI TUGAS,UTS,DAN UAS");
        System.out.println("==================================");

        System.out.print("Nilai Tugas : ");
        Nilai_tugas = input.nextInt();
        System.out.print("Nilai UTS : ");
        Nilai_UTS = input.nextInt();
        System.out.print("Nilai UAS : ");
        Nilai_UAS = input.nextInt();
        int Nilau_semua = Nilai_tugas + Nilai_UTS + Nilai_UAS;
        double Nilai_Akhir = Nilau_semua / 3;
        System.out.println("Nilai_Akhir : " + Nilai_Akhir);

        input.close();

    }
}
