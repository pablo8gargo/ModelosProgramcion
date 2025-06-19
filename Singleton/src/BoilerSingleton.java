public class BoilerSingleton {
    private boolean resistencia;
    private boolean vacio;

    private static BoilerSingleton instance;

    private BoilerSingleton() {
        resistencia = false;
        vacio = true;
    }

    public static BoilerSingleton getInstace() {
        if (instance == null)
            instance = new BoilerSingleton();
        return instance;
    }

    public boolean llenar() {
        if (vacio && !resistencia) {
            System.out.println("Llenando el boiler de chocolate y leche...");
            vacio= false;
            return true;
        } else {
            System.out.println("El boiler ya está lleno.");
            return false;
        }
    }

    public boolean mezclar() {
        if (!vacio && !resistencia) {
            System.out.println("Mezclando el chocolate y la leche...");
            resistencia = true;
            return true;
        } else {
            System.out.println("El boiler está vacío, no se puede mezclar.");
            return false;
        }
    }

    public boolean vaciar() {
        if (!vacio && resistencia) {
            System.out.println("Vaciando el boiler...");
            vacio = true;
            resistencia = false;
            return true;
        } else {
            System.out.println("El boiler ya está vacío.");
            return false;
        }
    }

    public boolean vacio(){
        return vacio;
    }
    
    public boolean resistencia() {
        return resistencia;
    }




}
