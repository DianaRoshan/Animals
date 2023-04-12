package field;
import entity.Animals;
import lombok.Data;

import java.util.List;

@Data
public class Field {
    private final int X=100;
    private final int Y=20;
    private Cell[][] field;
    public static List<Animals> allAnimals;
    Field(){
        this.field=new Cell[X][Y];  
    }

}
