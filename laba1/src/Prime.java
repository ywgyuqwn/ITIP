public class Prime {
    public static void main(String[] args) {
    for (int n = 2; n<101; n++)
        if (isPrime(n))
            System.out.print(n+" ");
}

    private static boolean isPrime(int n)
    {
        for (int k = 2; k<=Math.sqrt(n); k++)
            if (n%k==0){
                return false;}
        return true;
    }
}
