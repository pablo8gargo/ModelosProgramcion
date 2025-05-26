package main;

    public class ExpresionSiNo implements Expresion{
        
    private final boolean lastStatement;
    private final String mensaje;

    public ExpresionSiNo(boolean lastStatement, String mensaje) {
        this.lastStatement = lastStatement;
        this.mensaje = mensaje;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        if (!lastStatement && !mensaje.isEmpty()) {
            System.out.println(mensaje);
        }
        return true;
    }
}
