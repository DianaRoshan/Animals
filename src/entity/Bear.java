package entity;

public class Bear extends Animals implements Predator {
    Bear(){
        this.type= Type.BEAR;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Bear();
    }
}
