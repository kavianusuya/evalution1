public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(48,38,674));
        System.out.println(isValid(789));
    }
    public static boolean hasSameLastDigit(int a,int b,int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            int num1 = a%10;
            int num2 = b%10;
            int num3 = c%10;
            if(num1==num2 || num1==num3 || num2==num3){
                return true;
            }else
            {
                return false;
            }
        }else {
            return false;
        }
    }
    public static boolean isValid(int num){
        if (num>=10 && num<=1000){
            return true;
        }else {
            return false;
        }
    }
}
