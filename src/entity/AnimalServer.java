package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalServer {
    private List<Animals> serverList=new ArrayList<>();
    private Animals newAnimals;

    public void createAnimals(){
        createWolf();
        createDuck();
    }

    private void createWolf(){
        int rndNum= new Random().nextInt(Type.WOLF.getMaxCount());
        for (int i = 0; i < rndNum; i++) {
             newAnimals = new Wolf();
             serverList.add(newAnimals);
        }
    }
    private void createDuck(){
        int rndNum= new Random().nextInt(Type.DUCK.getMaxCount());
        for (int i = 0; i < rndNum; i++) {
            newAnimals=new Duck();
            serverList.add(newAnimals);
        }
    }

}
