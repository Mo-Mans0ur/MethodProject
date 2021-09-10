import java.util.Scanner;

public class MethodProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input the first number ");
        double number1 = scanner.nextDouble();
        System.out.println("please input your second number");
        double number2 = scanner.nextDouble();
        System.out.println("please input you third number");
        double number3 = scanner.nextDouble();

        System.out.println("the lowest number of your input is " + min(number1,number2,number3));

}
    public static double min(double number1, double number2, double number3) {
        return Math.min(Math.min(number1,number2),number3);



    }
}
