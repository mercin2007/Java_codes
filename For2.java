public class For2{
    public static void main(String[] args){
        System.out.println("For Loop:");
        System.out.println("1. Print even numbers from 10 to 0");
        int i;
        for(i=10; i>=0; i--){
            if(i%1==0){
                System.out.println(i);
            }
        }
    }
}