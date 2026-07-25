public class Break2{
    public static void main(String[] args){
        System.out.println("Break Statement:");
        System.out.println("print even numbers for1 to 50");
        for(int i=1; i<=50; i+=2){
            if(i==24){
                break;
            }
                System.out.println(i);
        }
    }
}