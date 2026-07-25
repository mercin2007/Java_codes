import java.util.*;
public class Even{
    public static void main(String[] args) {
        int i=7;
        boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println("prime number: " + i);

            }
            else {
                System.out.println("not prime number: " + i);
            }
        }
    }
