package entity;

//Гусеница
public class Caterpillar extends Animals implements Herbivores {
    Caterpillar(){
        this.type= Type.CATERPILLAR;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Caterpillar();
    }
}
