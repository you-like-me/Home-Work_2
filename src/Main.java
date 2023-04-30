import java.io.FileNotFoundException;
import java.util.Scanner;
/*1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
3.Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

public class Main {

    //Task1
    public static void EnterFloat() {
        Scanner sc = new Scanner(System.in);
        boolean user = true;

        while (user == true) {
            System.out.print("Введите дробное число: ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Введённое число не дробное! \n Повторите ввод:");
            }
        }
    }
    //Task2
    public static void someCode() {
        int[] intArray = new int[]{2, 4, 8, 1, 5, 7};
        int d = 2; //0
        int index = 2; //6
        if (d == 0) {
            System.out.println("Denominator can not be zero.");
        } else if (intArray == null) {
            System.out.println("Array is null.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Index out of range.");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }

    //Task3
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            }
            printSum(23, 234);
            int[] abc = {1, 2};
            int index = 3;
            if (index >= 0 && index < abc.length) {
                abc[index] = 9;
            }
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
//        someCode();
//        space();
        EnterFloat();
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    //Task4
    public static void space() {
        System.out.print("Введите данные: ");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Вы не ввели никаких данных");
        }
    }
}


