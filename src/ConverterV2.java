public class ConverterV2 {
    public void ConvertLitersToGallons(double Liters, double Gallons){
        int counter;

        counter = 0;

        for (Gallons = 1; Gallons <=30; Gallons++)
        {
            Liters = Gallons * 3.7854;

            System.out.println( Gallons  +  " Галлонов соотвествует " + Liters + " Литрам ");
            counter++;
            if(counter==10){
                System.out.println();
                counter = 0;
            }
        }

    }

}
