package interfaces.impl;

import interfaces.Animals;
import interfaces.GuideDogTraining;

public class TrainedGuideDog extends Dog implements GuideDogTraining {

    public boolean isTrained() {
        return true;
    }

    public TrainedGuideDog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    @Override
    public void voice(){
        System.out.println("Hello, my name is " + this.getName() + ". I can take you home.");
    }

}
