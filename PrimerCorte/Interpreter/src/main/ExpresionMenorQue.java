package main;

public class ExpresionMenorQue implements Expresion {
    
    private final String nombreVariable;
    private final int valor;

    public ExpresionMenorQue(String nombreVariable, int valor) {
        this.nombreVariable = nombreVariable;
        this.valor = valor;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.get(nombreVariable) < valor;
    }
}
