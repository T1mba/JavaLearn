import java.util.Scanner;
// Класс для конвертирования галлов в литры
public class Converter{
    public String ConvertGallons(double Gallons, double Liters, String Result ){

        /* Для поулчения ввода с консоли в классе System определен объект in. Однако непосредственно через объект System.in не очень удобно работать,
        поэтому, как правило, используют класс Scanner, который, в свою очередь использует System.in.
         */

        Liters = Gallons * 3.7854;
        String Res = Gallons + " Галонов соотвествует " + Liters + " Литрам";
        System.out.println(Res);
        return Res;
    }
}
