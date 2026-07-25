import java.util.HashSet;

public class Hello2 {
    static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("java");
        System.out.println(set);
    }
}
