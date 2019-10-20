import interfaces.impl.*;

public class Main {

    public static void main(String[] args) {
        TrainedGuideDog dog1 = new TrainedGuideDog(1, 10, 11, "White", "Barry");
        dog1.voice();
        new Fish(2, 1, 1, "Yellow", "Larry").voice();
        new Dog(3, 7, 8, "Black", "Garry").voice();
        new Cat(4, 5, 5, "Black", "Bobby").voice();
        new Giraffe(5, 15, 120, "Yellow").voice();
        new Wolf(6, 15, 50, "Grey").voice();

    }
}
