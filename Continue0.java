public class Continue0{
    public static void main(String[] args){
        System.out.println("Continue Statement:");
        System.out.println("Print  numbers from 1 to 20");
        for(int i=1; i<=20; i++){
            if(i==12){
                continue;
            }
            System.out.println(i);
        }
    }
}