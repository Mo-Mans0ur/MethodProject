import java.util.Scanner;

public class MethodProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1
        /*
        System.out.println("please input the first number ");
        double number1 = scanner.nextDouble();
        System.out.println("please input your second number");
        double number2 = scanner.nextDouble();
        System.out.println("please input you third number");
        double number3 = scanner.nextDouble();

        System.out.println("the lowest number of your input is " + min(number1,number2,number3));
        */

        //task 2
        /*
        int x = scanner.nextInt();
        System.out.println(x + " is " + checkPosNeg(x));
        */

        //task 3
        /*
        String character = "Mohammad";

        System.out.println("in " + findMiddleChar(character));
        */

        //task 4
        /*
        System.out.println("enter the first side of the triangle");
        double a = scanner.nextDouble();
        System.out.println("enter the second side of the triangle");
        double b = scanner.nextDouble();
        System.out.println("enter the third side of the triangle");
        double c = scanner.nextDouble();

        System.out.println("the area of the triangle is " + areaOfTriangle(a,b,c));
        */

        //task 5
        System.out.println("please enter password: ");
        String password = scanner.next();
        if (isValid(password)) {
            System.out.println("welcome user ");
        } else {
            System.out.println("password invalid");
        }


}      //task 1
    public static double min(double number1, double number2, double number3) {
        return Math.min(Math.min(number1,number2),number3);
    }

    // task 2
    public static String checkPosNeg(int x) {

        if (x > 0) {
            return "positiv";
        } else if (x < 0) {
            return "Negativ";
        } else {
            return "zero";
        }
    }
    // task 3
    public static String findMiddleChar(String characterInString) {

        int len = characterInString.length();
        int middle = len / 2;

        System.out.println("your character in the middle is " + characterInString.charAt(middle));

        return characterInString;
    }

    //task 4
    public static double areaOfTriangle(double a, double b, double c) {
       double s;
       s = (a+b+c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;

    }

    //task 5
    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        }else {
            char character;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                character = password.charAt(i);
                if (!Character.isLetterOrDigit(character)) {
                    return false;
                } else if (Character.isDigit(character)) {
                    i++;
                }
            }
        }
        return true;
    }
}
