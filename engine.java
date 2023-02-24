import java.util.Scanner;

public class engine {
    public double calculator() {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("введите первое число");
        num1 = sc1.nextDouble();
        System.out.println("введите второе число");
        num2 = sc1.nextDouble();


        System.out.println("введите арифметическое действие, доступно: сложение(+), вычитание(-), " +
                "умножение(*), деление(:)");
        char operationNum = sc.next().charAt(0);
        double total = 0;

        switch (operationNum) {
            case '+':
                return total = num1 + num2;
            case '-':
                return total = num1 - num2;

            case '*':
                return total = num1 * num2;

            case ':':
                try {
                    total = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("деление на нуль невозможно");
                }
            break;
        }
return total;
    }
}

