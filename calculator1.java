import java.util.Scanner;

public class calculator1 {
    public static void main(String args[]){
        double num1 = getNumber();
        char operation = getOperation();
        double num2 = getNumber();
        double calc = calculatedNumber(num1, num2, operation );
        System.out.println("ответ: "+calc);

    }
    public static double getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите любое число:");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("ошибка, введите любое число");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите арифметическое действие, доступно: сложение(1), вычитание(2), " +
                "умножение(3), деление(4)");
        int operationNum = 0;
        if (sc.hasNextInt()) {
            operationNum = sc.nextInt();
        } else {
            System.out.println("ошибка, введите номер доступной арифметической операции");
            return getOperation();
        }

        switch (operationNum) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return ':';
            default:
                System.out.println("ошибка, введите доступню арифметическую операцию");
                return getOperation();

        }
    }
    public static double add(double num1, double num2) {
        return num1+num2;
    }
    public static double sub(double num1, double num2) {
        return num1-num2;
    }
    public static double div(double num1, double num2) {
        if (num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("ошибка, на нуль делить нельзя");
            return Double.NaN;
        }
    }
    public static double mul(double num1, double num2) {
        return num1*num2;
    }

    public static double calculatedNumber(double num1, double num2, char operation) {
        switch (operation) {
            case '+': return add(num1, num2);
            case '-': return sub(num1, num2);
            case '*': return mul(num1, num2);
            case ':': return div(num1, num2);
            default: return Double.NaN;
        }


    }
}


