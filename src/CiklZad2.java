import java.util.Random;
import java.util.Scanner;

/**
 * Created by Devil Trigger S on 28.09.2014.
 */
public class CiklZad2 {
    public static void main(String[] args) {
       int x = new Random().nextInt(100) + 1; // случайное число от 1 до 100
while (true) {
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt(); // число, прочитанное с клавиатуры
            if (guess == x) {
                System.out.println("Поздравляем Вы Выйграли");
                break;
            } else {
                if (guess > x) {
                    System.out.println("Введенное число больше загаданного");

                } else {
                    System.out.println("Введенное число меньше загаданного");

                }
            }
        }
            System.out.println("Загаданное число - "+x);
        }
    }
