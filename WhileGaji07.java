import java.util.Scanner;

public class WhileGaji07 {

    public static void main(String [] args) {

        Scanner scan =new Scanner(System.in);

        int jumlahKaryawan;
        int jumlahJamLembur;
        double totalGajiLembur = 0;
        double gajiLembur = 0;
        String jabatan = "";

        System.out.print("Masukan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total gaji lembur: " + totalGajiLembur);

    }
    
}