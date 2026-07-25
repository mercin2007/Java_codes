import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Length: " + str.length());
        System.out.println("charAt(0): " + str.charAt(0));
        System.out.println("Touppercase: " + str.toUpperCase());
        System.out.println("Tolowercase: " + str.toLowerCase());
        System.out.println("Equal: " + str.equals("java"));
        System.out.println("Equal&Ignorecase: " + str.equalsIgnoreCase("java"));
        System.out.println("Contain: " + str.contains("pro"));
        System.out.println("Substring: " + str.substring(2));
        System.out.println("Replace'A' with '@':" + str.replace("@", ""));
        System.out.println("Trim: " + str.trim());
        sc.close();

    }
}


