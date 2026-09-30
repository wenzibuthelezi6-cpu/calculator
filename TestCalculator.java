import java.util.Scanner;

public class TestCalculator{
 public static void main(String [] args){
 
 Scanner scanner = new Scanner(System.in);
 Calculator calculator = new Calculator();

 
 System.out.println("Enter a value:");
 double value = scanner.nextDouble();
 calculator.add(value);
 
 System.out.println("Enter a value:");
 value = scanner.nextDouble();
 calculator.subtract(value);
 
 System.out.println("Enter a value:");
 value = scanner.nextDouble();
 calculator.multiply(value);
 
 System.out.println("Enter a value:");
 value = scanner.nextDouble();
 calculator.divide(value);
 
 
 System.out.println(calculator.getResult());
 calculator.clear();
 System.out.println(calculator.getResult());

 
 
 }
}