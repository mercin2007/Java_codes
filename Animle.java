class Ani {
    void sound() {
        System.out.println("Animle makes sound");
    }
}

class dog extends Ani {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Animle {
    static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.bark();
    }
}