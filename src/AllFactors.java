public class AllFactors {
    public static void main(String[] args){
printFactors(32);
    }
    public static void printFactors(int number){
      int factor = 1;
      if(number>1){
           for(int i=1;i<=number;i++){
               if(number%i==0){
                   factor=i;
                   System.out.println("factors are: "+factor);
               }
           }
        }else
      {
          System.out.println("invalid value");
      }
    }
}
