import java.util.Scanner;

public class TestAverageTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter days");
        int days=scanner.nextInt();

        AverageTemperature temp=new AverageTemperature(days);
        float result=temp.calculeTemperature();
        int above=temp.getDaysAboveAverage(result);

        System.out.println("Average Temp "+result);
        System.out.println("Days above average "+above);
    }
}
