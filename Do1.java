public class Do1{
    public static void main(String[] args){
        System.out.println("Do While Loop:");
        System.out.println("1. Print odd numbers from 1 to 20");
        int i=1;
        do{
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }while(i<=20);
    }
}