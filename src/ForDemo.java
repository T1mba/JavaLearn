import java.util.Scanner;
// Класс для использования Цикла FOR
public class ForDemo {
    void Demo(int count){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number ;
        number = in.nextInt();
        for(count = number; count<5;count = count +1)
            System.out.println("Значение count = " + count);

    }
}
