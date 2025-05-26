import java.util.Scanner;

public class numbercounter {
    public static void main(String[] args) {
        int positive = 0,negative =0,zeros =0;
        System.out.println("press '1' to continue or '0' to left");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input==1) {
            System.out.println("enter your number");
            int number = sc.nextInt();
        if (number>0) {
            positive++;
        }else if (number<0) {
            negative++;
        }else{
            zeros++;
        }
            System.out.println("press 1 to continue & 0 to left");
            input = sc.nextInt();
        }
           System.out.println("Positives : "+ positive);
           System.out.println("Negatives : "+ negative);
           System.out.println("Zeros : "+ zeros);
    }
}
