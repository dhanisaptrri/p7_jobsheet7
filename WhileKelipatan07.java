import java.util.Scanner;

public class WhileKelipatan07{

    public static void main (String [] argss){

        Scanner scan =new Scanner(System.in);

        int kelipatan;
        int total = 0;
        int counter = 0;
        double ratarata;

        System.out.print("Masukan bilangan kelipatan (1-9) : ");

        kelipatan = scan.nextInt();
        int i = 1;
        while ( i<=50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }i++;
        }
        ratarata = (double) total / counter;
        System.out.printf("Banyaknya bilangan dari %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);

        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        
        System.out.println("Rata - rata dari seluruh bilangan kelipatan: " + ratarata);
    }
}