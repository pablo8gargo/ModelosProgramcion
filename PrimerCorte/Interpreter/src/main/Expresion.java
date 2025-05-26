package main;

public interface Expresion {
    boolean result = false;
    boolean interpretar(Contexto contexto);

    default boolean getResult() {
        return result;
    }

}
