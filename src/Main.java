import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("ВВедите возраст");
        int num = scanner.nextInt();
        if (num < 18){
            System.out.println("ваш возраст не соответствует ограничениям");
        } else if (num >= 18) {
            System.out.println("Вам доступен выбор пиво");
        }
    }
}