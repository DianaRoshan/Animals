package entity;

import java.util.HashMap;
import java.util.Map;

public class PossibilitySetter {
    public static Map<Type, Double> setMap(Type type){

        if(type==Type.WOLF) {
            Map<Type, Double> wolfMap=new HashMap<>();
            wolfMap.put(Type.WOLF, 0.0);
            wolfMap.put(Type.SNAKE, 0.0);
            //wolfMap.put(entity.Type.FOX,0.0);
            wolfMap.put(Type.BEAR, 0.0);
            //wolfMap.put(entity.Type.EAGLE,0.0);
            //wolfMap.put(entity.Type.HORSE,0.1);
            //wolfMap.put(entity.Type.DEER,0.15);
            //wolfMap.put(entity.Type.RABBIT,0.6);
            //wolfMap.put(entity.Type.MOUSE,0.8);
            //wolfMap.put(entity.Type.GOAT,0.6);
            //wolfMap.put(entity.Type.SHEEP,0.7);
            //wolfMap.put(entity.Type.BOAR,0.15);
            wolfMap.put(Type.BUFFALO, 0.1);
            wolfMap.put(Type.DUCK, 0.4);
            wolfMap.put(Type.CATERPILLAR, 0.0);
            return wolfMap;
        } else if (type==Type.SNAKE) {
            Map<Type, Double> snakeMap=new HashMap<>();
            snakeMap.put(Type.WOLF, 0.0);
            snakeMap.put(Type.SNAKE, 0.0);
            //snakeMap.put(entity.Type.FOX,0.15);
            snakeMap.put(Type.BEAR, 0.0);
            //snakeMap.put(entity.Type.EAGLE,0.0);
            //snakeMap.put(entity.Type.HORSE,0.0);
            //snakeMap.put(entity.Type.DEER,0.0);
            //snakeMap.put(entity.Type.RABBIT,0.2);
            //snakeMap.put(entity.Type.MOUSE,0.4);
            //snakeMap.put(entity.Type.GOAT,0.0);
            //snakeMap.put(entity.Type.SHEEP,0.0);
            //snakeMap.put(entity.Type.BOAR,0.0);
            snakeMap.put(Type.BUFFALO, 0.0);
            snakeMap.put(Type.DUCK, 0.1);
            snakeMap.put(Type.CATERPILLAR, 0.0);
            return snakeMap;
        } else if (type==Type.FOX) {
            Map<Type, Double> foxMap=new HashMap<>();
            foxMap.put(Type.WOLF, 0.0);
            foxMap.put(Type.SNAKE, 0.0);
            //foxMap.put(entity.Type.FOX,0.0);
            foxMap.put(Type.BEAR, 0.0);
            //foxMap.put(entity.Type.EAGLE,0.0);
            //foxMap.put(entity.Type.HORSE,0.0);
            //foxMap.put(entity.Type.DEER,0.0);
            //foxMap.put(entity.Type.RABBIT,0.7);
            //foxMap.put(entity.Type.MOUSE,0.9);
            //foxMap.put(entity.Type.GOAT,0.0);
            //foxMap.put(entity.Type.SHEEP,0.0);
            //foxMap.put(entity.Type.BOAR,0.0);
            foxMap.put(Type.BUFFALO, 0.0);
            foxMap.put(Type.DUCK, 0.6);
            foxMap.put(Type.CATERPILLAR, 0.4);
            return foxMap;
        } else if (type==Type.BEAR) {
            Map<Type, Double> bearMap=new HashMap<>();
            bearMap.put(Type.WOLF, 0.0);
            bearMap.put(Type.SNAKE, 0.8);
            //bearMap.put(entity.Type.FOX,0.0);
            bearMap.put(Type.BEAR, 0.0);
            //bearMap.put(entity.Type.EAGLE,0.0);
            //bearMap.put(entity.Type.HORSE,0.4);
            //bearMap.put(entity.Type.DEER,0.8);
            //bearMap.put(entity.Type.RABBIT,0.8);
            //bearMap.put(entity.Type.MOUSE,0.9);
            //bearMap.put(entity.Type.GOAT,0.7);
            //bearMap.put(entity.Type.SHEEP,0.7);
            //bearMap.put(entity.Type.BOAR,0.5);
            bearMap.put(Type.BUFFALO, 0.20);
            bearMap.put(Type.DUCK, 0.1);
            bearMap.put(Type.CATERPILLAR, 0.0);
            return bearMap;
        }else if(type==Type.BUFFALO || type==Type.CATERPILLAR){
            Map<Type, Double> zeroMap=new HashMap<>();
            zeroMap.put(Type.WOLF, 0.0);
            zeroMap.put(Type.SNAKE, 0.0);
            //zeroMap.put(entity.Type.FOX,0.0);
            zeroMap.put(Type.BEAR, 0.0);
            //zeroMap.put(entity.Type.EAGLE,0.0);
            //zeroMap.put(entity.Type.HORSE,0.0);
            //zeroMap.put(entity.Type.DEER,0.0);
            //zeroMap.put(entity.Type.RABBIT,0.0);
            //zeroMap.put(entity.Type.MOUSE,0.0);
            //zeroMap.put(entity.Type.GOAT,0.0);
            //zeroMap.put(entity.Type.SHEEP,0.0);
            //zeroMap.put(entity.Type.BOAR,0.0);
            zeroMap.put(Type.BUFFALO, 0.0);
            zeroMap.put(Type.DUCK, 0.0);
            zeroMap.put(Type.CATERPILLAR, 0.0);
            return zeroMap;
        } else if (type==Type.DUCK) {
            Map<Type, Double> duckMap=new HashMap<>();
            duckMap.put(Type.WOLF, 0.0);
            duckMap.put(Type.SNAKE, 0.0);
            //duckMap.put(entity.Type.FOX,0.0);
            duckMap.put(Type.BEAR, 0.0);
            //duckMap.put(entity.Type.EAGLE,0.0);
            //duckMap.put(entity.Type.HORSE,0.0);
            //duckMap.put(entity.Type.DEER,0.0);
            //duckMap.put(entity.Type.RABBIT,0.0);
            //duckMap.put(entity.Type.MOUSE,0.0);
            //duckMap.put(entity.Type.GOAT,0.0);
            //duckMap.put(entity.Type.SHEEP,0.0);
            //duckMap.put(entity.Type.BOAR,0.0);
            duckMap.put(Type.BUFFALO, 0.0);
            duckMap.put(Type.DUCK, 0.0);
            duckMap.put(Type.CATERPILLAR, 0.9);
            return duckMap;
        }else {
            return null;
        }
    }
}
