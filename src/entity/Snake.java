package entity;

public class Snake extends Animals implements Predator {
    Snake(){
        this.type= Type.SNAKE;
    }

    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Snake();
    }
}
