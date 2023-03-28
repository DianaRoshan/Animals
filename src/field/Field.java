package field;
import entity.Animals;
import lombok.Data;

import java.util.List;

@Data
public class Field {
    private Cell[][] field;
    public static List<Animals> allAnimals;
    Field(int x,int y){
        this.field=new Cell[x][y];
    }

}
