public class While2{
    public static void main(String[] args){
        System.out.println("While Loop:");
        System.out.println("1. Print odd numbers from 1 to 10");
        int i=1;
        while(i<=10){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}