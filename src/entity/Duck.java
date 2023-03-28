package entity;

public class Duck extends Animals implements Herbivores {
    Duck(){
        this.type= Type.DUCK;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Duck();
    }
}
