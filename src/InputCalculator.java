import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
inputThenSumAndAverage();
    }
    public static void inputThenSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum=0, count=0, average=0;
        System.out.println("enter the numbers");
        while (sc.hasNextInt()){
            int number = sc.nextInt();
            sum = sum+number;
            count++;
        }
        if(count>0){
            int avr = sum/count;
            System.out.println("SUM ="+sum+ " " +"AVG = "+Math.round(avr));
        }else{
            System.out.println("sum = " +sum+ "average="+average);
        }


    }
}
