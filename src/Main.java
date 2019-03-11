import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human jane = new Human("jane");

        //jane.printInfo();
        //jane.printInfo(3);

        List<Food> foods = new ArrayList();
        foods.add(new Apple());
        foods.add(new Mango());

        for(int i = 0; i < foods.size(); i++) {
            jane.eat(foods.get(i));
        }
    }
}
