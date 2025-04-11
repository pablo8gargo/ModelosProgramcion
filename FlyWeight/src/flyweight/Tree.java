package flyweight;

public class Tree {
    private int x, y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        System.out.printf("Árbol '%s' en posición (%d, %d)%n", type.getName(), x, y);
    }
}
