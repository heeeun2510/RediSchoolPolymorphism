public class Human implements Animal {
    String name;

    Human(String name) {
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.println("I am eating " + food.getName());
    }


    //public abstract void say();
}
