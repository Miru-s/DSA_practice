import java.util.Scanner;

public class kthBit {
    static void printKthBit(long n, long k)
    {
        System.out.println(
            ((n & (1 << (k - 1))) >> (k - 1)));
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        long n , k ;
        System.out.println("Enter n and k");
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        k = in.nextLong();
       
        // Function Call
        printKthBit(n, k);
    }
    
}
