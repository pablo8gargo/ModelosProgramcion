import kia.Car;
import kia.accessories.AluminumRim;
import kia.accessories.BicycleRack;
import kia.accessories.ThreePieceCarpet;
import kia.cars.VibrantMT;
import kia.cars.ZenithAT;
import kia.cars.ZenithMT;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new VibrantMT();
        System.out.println(car.getDescription() + " $ " +car.cost());

        Car car2 = new ZenithAT();
        car2 = new AluminumRim(car2);
        car2 = new ThreePieceCarpet(car2);
        car2 = new BicycleRack(car2);
        System.out.println(car2.getDescription() + " $ " +car2.cost());

        Car car3 = new ZenithMT();
        car2 = new AluminumRim(car3);
        System.out.println(car2.getDescription() + " $ " +car2.cost());

    }
}

