import java.util.Scanner;

public class AverageTemperature {
    final int days;

    Scanner scanner=new Scanner(System.in);
    public int[] temperature;
    public AverageTemperature(int d){
        this.days=d;
        temperature= new int[days];
    }
    //Calculate average
    public float calculeTemperature(){
        int sumTemperature=0;
        for(int i=0; i<days; i++){
            System.out.println("Day "+(i+1)+"'s height temperature: ");
            temperature[i]=scanner.nextInt();
            sumTemperature+=temperature[i];
        }
        return  sumTemperature/days;
    }

    public int getDaysAboveAverage(float average) {
        int above=0;
        for (int i=0;i<temperature.length;i++){
            if(temperature[i]>average){
                above++;
            }
        }
        return above;
    }
}
