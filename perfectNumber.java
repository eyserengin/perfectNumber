import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");

        int number = scanner.nextInt();

        int total = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                total += number;
            }
        }

        if(total == number){
            System.out.println(number + " is a perfect number");
        }
        else
            System.out.println(number + " is not a perfect number");
    }
}
