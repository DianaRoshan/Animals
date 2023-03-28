package entity;

public abstract class Animals {
    public static final int FEMALE=0;
    public static final int MALE=1;
    public Type type;
    public String name;
    public int gender;

    public abstract void eat();
    public abstract void move(int x);
    public abstract Animals reproduce();
}
