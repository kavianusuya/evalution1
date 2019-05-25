public class LargestPrime
{
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(10));
        System.out.println(isPrimeNumber(10));
    }
    public static int getLargestPrime(int number)
    {
        for (int i = number - 1; i >= 1; i--)
        {
            if ((number % i == 0) && (isPrimeNumber(i)))
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrimeNumber(int number)
    {
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
