import java.util.LinkedList;

public class List2 {
    static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.add("Coimbatore");
        cities.add("Madurai");
        cities.add("Trichy");
        cities.add("Salem");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        cities.addFirst("Bangalore");

        cities.addLast("Hyderabad");

        cities.removeFirst();
        cities.removeLast();

        cities.set(2, "Erode");

        if (cities.contains("Chennai")) {
            System.out.println("Chennai is present in the list.");
        } else {
            System.out.println("Chennai is not present in the list.");
        }
    }
}
