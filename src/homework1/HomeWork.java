package homework1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Расскажите о вашем друге");
        System.out.println("Как зовут вашего друга?");

        String name = scanner.nextLine();
        System.out.println("Сколько лет вашему другу?");

        String age = scanner.nextLine();
        System.out.println("Моему другу " + name + " сейчас " + age + " лет");
    }
}
