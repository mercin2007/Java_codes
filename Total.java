import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int total = 0;
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            total += array[i];
        }
        int max = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        double average = (double) total / 5;
        System.out.println("Total=" + total);
        System.out.println("Max=" + max);
        System.out.println("Average=" + average);
    }
}
