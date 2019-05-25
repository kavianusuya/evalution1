public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number)
    {
        int divisior = 0;
        if(number>1){
            for(int i=1;i<number;i++){
                if(number%i==0){
                    divisior=divisior+i;
                  }
        }
            System.out.println(divisior);
            if(number==divisior){
                return true;
            }
            else {
                return false;
            }
    }else {
            return false;
        }
}}
