import java .util.Scanner;
public class Task2{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Department code(1-4): ");
        int code = Sc.nextInt();
        switch(code){
            case 1:
                System.out.println("Computer Science");
                break;
            case 2:
                System.out.println("Information Technology");
                break;
            case 3:
                System.out.println("Electronics and Communication");
                break;
            case 4:
                System.out.println("Mechanical Engineering");
                break;
            default:
                System.out.println("Invalid Department code. Please enter a valid code.");
        }
    }
}
