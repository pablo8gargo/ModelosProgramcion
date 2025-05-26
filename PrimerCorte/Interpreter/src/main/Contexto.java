package main;

public class Contexto {
	private int juan;
    private int pedro;
    private int luis;

    public Contexto() {
        this.juan = 20;
        this.pedro = 15;
        this.luis = 30;
    }

    public int get(String nombre) {
        switch (nombre.toLowerCase()) {
            case "juan": return juan;
            case "pedro": return pedro;
            case "luis": return luis;
            default: return -1; 
        }
    }
}
