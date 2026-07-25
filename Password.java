import java.util.Scanner;
public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "Mercin";
        String input;
        int attempts = 0;
        boolean accessGranted = false;

        while(attempts < 3 && !accessGranted){
            System.out.print("Enter your password: ");
            input = sc.nextLine();
            if(input.equals(password)){
                accessGranted = true;
                System.out.println("Access granted.");
            } else {
                attempts++;
                System.out.println("Incorrect password. Attempts left: " + (3 - attempts));
            }
        }

        if(!accessGranted){
            System.out.println("Access denied. Too many incorrect attempts.");
        }
        sc.close();
    }
}
