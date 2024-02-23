import java.util.Scanner;
// Класс для использования метода IF
public class Demo {
public void UseIf(int a, int b) {
 int c;

        if(a<b) System.out.println("Значение а меньше б");
        if(a==b) System.out.println("Значение а равно б");
        System.out.println();
        c = a - b;
    System.out.println("Переменная c содержит: " + c);
    if(c >=0) System.out.println("Значение " + c + " Неотрицательное");
    else System.out.println("Значение " + c + " Отрицательное");
    System.out.println();
    c = b - a;
    if(c >= 0) System.out.println("Значение " + c + " Неотрацительное");
    else System.out.println("Значение " + c + " Отрицательное");
}
}
