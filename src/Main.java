import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner1.nextInt();
        System.out.println("-----------------g");
        System.out.println(number + " to jest liczba odczytana z klawiatury");
        System.out.printf("To jest liczba odczytana z klawiatury\n", number);


    }
}