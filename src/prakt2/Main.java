package prakt2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int number = 12345;

            System.out.print("Обратное число: ");


            while (number > 0) {
                System.out.print(number % 10);
                number = number / 10;
            }
        }
    }
