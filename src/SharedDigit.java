public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(93,30));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if((n1>=10&&n1<=99) && (n2>=10&&n2<=99)){
            int a, b, c, d;
            a = n1 % 10;
            b = n2 % 10;
            c = n1 / 10;
            d = n2 / 10;

            if ((a == b) || (c ==d) || (a == d) || (b == c)){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

}
