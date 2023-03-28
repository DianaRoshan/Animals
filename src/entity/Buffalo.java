package entity;

//Буйвол
public class Buffalo extends Animals implements Herbivores {
    Buffalo(){
        this.type= Type.BUFFALO;
    }
    @Override
    public void eat() {

    }

    @Override
    public void move(int x) {

    }

    @Override
    public Animals reproduce() {
        return new Buffalo();
    }
}
