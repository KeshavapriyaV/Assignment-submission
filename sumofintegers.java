// Here's a Java program that prompts the user to input five integers and then calculates and displays their sum:
import java.util.Scanner;

public class sumofintegers{
  public static void main(String[] args) {
    int sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter five integers:");
    for (int i = 0; i < 5; i++) {
      sum += input.nextInt();
    }
    System.out.println("The sum is " + sum);
  }
}
 