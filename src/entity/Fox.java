package entity;

public class Fox extends Animals implements Predator {
    Fox(){
        this.type= Type.FOX;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Fox();
    }
}
