package entity;

public class PossibilitySetter {
    public static void setMap(Type type){
        if(type==Type.WOLF) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.1);
            //type.chanceToEat.put(entity.Type.DEER,0.15);
            //type.chanceToEat.put(entity.Type.RABBIT,0.6);
            //type.chanceToEat.put(entity.Type.MOUSE,0.8);
            //type.chanceToEat.put(entity.Type.GOAT,0.6);
            //type.chanceToEat.put(entity.Type.SHEEP,0.7);
            //type.chanceToEat.put(entity.Type.BOAR,0.15);
            type.chanceToEat.put(Type.BUFFALO, 0.1);
            type.chanceToEat.put(Type.DUCK, 0.4);
            type.chanceToEat.put(Type.CATERPILLAR, 0.0);
        } else if (type==Type.SNAKE) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.15);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.0);
            //type.chanceToEat.put(entity.Type.DEER,0.0);
            //type.chanceToEat.put(entity.Type.RABBIT,0.2);
            //type.chanceToEat.put(entity.Type.MOUSE,0.4);
            //type.chanceToEat.put(entity.Type.GOAT,0.0);
            //type.chanceToEat.put(entity.Type.SHEEP,0.0);
            //type.chanceToEat.put(entity.Type.BOAR,0.0);
            type.chanceToEat.put(Type.BUFFALO, 0.0);
            type.chanceToEat.put(Type.DUCK, 0.1);
            type.chanceToEat.put(Type.CATERPILLAR, 0.0);
        } else if (type==Type.FOX) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.0);
            //type.chanceToEat.put(entity.Type.DEER,0.0);
            //type.chanceToEat.put(entity.Type.RABBIT,0.7);
            //type.chanceToEat.put(entity.Type.MOUSE,0.9);
            //type.chanceToEat.put(entity.Type.GOAT,0.0);
            //type.chanceToEat.put(entity.Type.SHEEP,0.0);
            //type.chanceToEat.put(entity.Type.BOAR,0.0);
            type.chanceToEat.put(Type.BUFFALO, 0.0);
            type.chanceToEat.put(Type.DUCK, 0.6);
            type.chanceToEat.put(Type.CATERPILLAR, 0.4);
        } else if (type==Type.BEAR) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.8);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.4);
            //type.chanceToEat.put(entity.Type.DEER,0.8);
            //type.chanceToEat.put(entity.Type.RABBIT,0.8);
            //type.chanceToEat.put(entity.Type.MOUSE,0.9);
            //type.chanceToEat.put(entity.Type.GOAT,0.7);
            //type.chanceToEat.put(entity.Type.SHEEP,0.7);
            //type.chanceToEat.put(entity.Type.BOAR,0.5);
            type.chanceToEat.put(Type.BUFFALO, 0.20);
            type.chanceToEat.put(Type.DUCK, 0.1);
            type.chanceToEat.put(Type.CATERPILLAR, 0.0);
        }else if(type==Type.BUFFALO){
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.0);
            //type.chanceToEat.put(entity.Type.DEER,0.0);
            //type.chanceToEat.put(entity.Type.RABBIT,0.0);
            //type.chanceToEat.put(entity.Type.MOUSE,0.0);
            //type.chanceToEat.put(entity.Type.GOAT,0.0);
            //type.chanceToEat.put(entity.Type.SHEEP,0.0);
            //type.chanceToEat.put(entity.Type.BOAR,0.0);
            type.chanceToEat.put(Type.BUFFALO, 0.0);
            type.chanceToEat.put(Type.DUCK, 0.0);
            type.chanceToEat.put(Type.CATERPILLAR, 0.0);
        } else if (type==Type.DUCK) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.0);
            //type.chanceToEat.put(entity.Type.DEER,0.0);
            //type.chanceToEat.put(entity.Type.RABBIT,0.0);
            //type.chanceToEat.put(entity.Type.MOUSE,0.0);
            //type.chanceToEat.put(entity.Type.GOAT,0.0);
            //type.chanceToEat.put(entity.Type.SHEEP,0.0);
            //type.chanceToEat.put(entity.Type.BOAR,0.0);
            type.chanceToEat.put(Type.BUFFALO, 0.0);
            type.chanceToEat.put(Type.DUCK, 0.0);
            type.chanceToEat.put(Type.CATERPILLAR, 0.9);
        } else if (type==Type.CATERPILLAR) {
            type.chanceToEat.put(Type.WOLF, 0.0);
            type.chanceToEat.put(Type.SNAKE, 0.0);
            //type.chanceToEat.put(entity.Type.FOX,0.0);
            type.chanceToEat.put(Type.BEAR, 0.0);
            //type.chanceToEat.put(entity.Type.EAGLE,0.0);
            //type.chanceToEat.put(entity.Type.HORSE,0.0);
            //type.chanceToEat.put(entity.Type.DEER,0.0);
            //type.chanceToEat.put(entity.Type.RABBIT,0.0);
            //type.chanceToEat.put(entity.Type.MOUSE,0.0);
            //type.chanceToEat.put(entity.Type.GOAT,0.0);
            //type.chanceToEat.put(entity.Type.SHEEP,0.0);
            //type.chanceToEat.put(entity.Type.BOAR,0.0);
            type.chanceToEat.put(Type.BUFFALO, 0.0);
            type.chanceToEat.put(Type.DUCK, 0.0);
            type.chanceToEat.put(Type.CATERPILLAR, 0.0);
        }

    }
}
