public class App {
    public static void main(String[] args) {
        BoilerSingleton boiler = BoilerSingleton.getInstace();
        boiler.mezclar();
        boiler.vaciar();
        boiler.llenar();
        boiler.mezclar();
        boiler.vaciar();
    }
}
