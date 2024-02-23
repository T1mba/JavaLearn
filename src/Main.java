import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
Программа для преобразования галонов в литры
        Converter Con = new Converter();
        double Gallons;
        double Litters = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество галлонов: ");
        Gallons = in.nextDouble();
        String Res = "Результат: ";
        Con.ConvertGallons(Gallons,Litters,Res);
*/
        /* Использования класса DemoIF
        Demo Demo = new Demo();
        int one, two;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение А:");
        one = in.nextInt();
        System.out.println("Введите значение Б");
        two = in.nextInt();
        Demo.UseIf(one,two);

         */

        /* Использование класса ForDemo
        ForDemo fordemo = new ForDemo();
        int count = 0;
        fordemo.Demo( count);

         */
        ConverterV2 SecondConverter = new ConverterV2();
        double Gallons=1;
        double Litters=1;
        SecondConverter.ConvertLitersToGallons(Gallons,Litters);



    }

}
