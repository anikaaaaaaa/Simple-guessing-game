import java.util.Scanner;
public class Simplegame {

    public static void random(int max, int min) {
        char ch;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1-100: ");
            int a = sc.nextInt();
            int b = (int) (Math.random() * (max - min) + min);
            System.out.println("The random number is " + b);
            if (a == b) {
                System.out.println("You guessed the correct number");
            } else if (a > b) {
                System.out.println("Your guess is higher than the random number");

            } else {
                System.out.println("Your guess is lower than the random number");
            }
            System.out.println("Do you want to continue? Y/N");
            ch=sc.next().charAt(0);


        }
        while(ch=='Y');
    }
    public static void main(String[] args) {

        random(100, 1);

    }
}

