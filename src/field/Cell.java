package field;
import entity.Animals;
import entity.Plants;
import lombok.Data;
import java.util.List;
import java.util.Random;

//Клеточка
@Data
public class Cell {
    public static List<Animals> animalsOnCell;
    private int cntOfPlants;
   // заполнение исходными значениями
    public void start(){
        Random rndPlants = new Random();
        cntOfPlants= rndPlants.nextInt(Plants.PLANTS_MAX_COUNT);

        //создать рандомных животных
    }
}
