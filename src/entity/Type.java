package entity;

import java.util.Map;

public enum Type {
//🐃, 🐻, 🐎, 🦌, 🐗, 🐑, 🐐, 🐺, 🐍, 🦊, 🦅, 🐇, 🦆, 🐁, 🐛

    WOLF(50,8,30,3, "\uD83D\uDC3A"),
    SNAKE(15,3,30,1,"\uD83D\uDC0D"),
    FOX(8,2,30,2,"\uD83E\uDD8A"),
    BEAR(500,80,5,2, "\uD83D\uDC3B"),
    BUFFALO(700,100,10,3,"\uD83D\uDC03"),
    DUCK(1,0.15,200,4,"\uD83E\uDD86"),
    CATERPILLAR(0.01,0,1000,0,"\uD83D\uDC1B");

    private final double weight;
    private final double foodWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final String img;
    private Map<Type, Double> chanceToEat;

    Type(double weight, double foodWeight, int maxCount, int maxSpeed, String img){
        this.weight = weight;
        this.foodWeight = foodWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.img = img;
    }

    public double getWeight() {
        return weight;
    }
    public double getFoodWeight() {
        return foodWeight;
    }
    public int getMaxCount() {
        return maxCount;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getImg() {
        return img;
    }
    public Map<Type, Double> getChanceToEat() {
        if (chanceToEat==null){
            chanceToEat=PossibilitySetter.setMap(this);
        }
        return chanceToEat;
    }
}
