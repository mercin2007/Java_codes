public class Break1{
    public static void main(String[] args){
        System.out.println("Break Statement:");
        System.out.println("Print  numbers from 1 to 20");
        for(int i=1; i<=20; i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }
    }
}