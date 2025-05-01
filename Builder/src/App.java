import home.Burguer;
import home.Chef;
import home.TodoTerrenoBurguerBuilder;

public class App {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.setBurguerBuilder(new TodoTerrenoBurguerBuilder());

        Burguer TodoTerrenoBurguerBuilder = chef.BurguerBuilder();
        System.out.println(TodoTerrenoBurguerBuilder.toString());

    }
}
