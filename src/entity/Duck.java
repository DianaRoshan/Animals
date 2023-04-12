package entity;

import java.util.Random;

public class Duck extends Animals implements Herbivores {
    private int cntOfDuck =0;
    public int weightOfEatenFood=0;
    public Duck(){
        this.name="Duck #"+ cntOfDuck;
        this.type=Type.DUCK;
        this.gender= new Random().nextInt(FEMALE,MALE);
        cntOfDuck++;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        cntOfDuck++;
        return new Duck();
    }
}
