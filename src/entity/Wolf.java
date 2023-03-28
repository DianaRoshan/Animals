package entity;

import lombok.Data;

import java.util.Random;
@Data
public class Wolf  extends Animals implements Predator {
    private int cntOfWolf=0;
    public int weightOfEatenFood=0;
    Wolf(){
        this.name="Wolf #"+cntOfWolf;
        this.type=Type.WOLF;
        this.gender= new Random().nextInt(FEMALE,MALE);
        cntOfWolf++;
    }


    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        cntOfWolf++;
        return new Wolf();
    }
}
