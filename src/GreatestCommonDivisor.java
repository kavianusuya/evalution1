public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
       int gcd = 1;
       if(first>10 && second>10){
           for(int i = 1; i<=first && i<=second; i++){
               if(first%i==0 && second%i==0){
                   gcd=i;
               }
           }
           System.out.println("gcd of 2 numbers is " +gcd);
        }else
       {
           return -1;
       }
        return gcd;
    }
}
