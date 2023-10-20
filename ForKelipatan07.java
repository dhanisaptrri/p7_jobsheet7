import java.util.Scanner;

public class ForKelipatan07{

    public static void main (String [] argss){

        Scanner scan =new Scanner(System.in);

        int kelipatan;
        int total = 0;
        int counter = 0;

        System.out.print("Masukan bilangan kelipatan (1-9) : ");

        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0 ) {
                total += i;
                counter++;

                
            }
        }

        System.out.printf("Banyaknya bilangan dari %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);

        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}