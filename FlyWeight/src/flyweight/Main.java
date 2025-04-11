package flyweight;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long startMemory = runtime.totalMemory() - runtime.freeMemory();

        Forest forest = new Forest();
        Random rand = new Random();

        String[] names = {"Roble", "Abedul", "Nogal"};
        String[] leafTextures = {"Frondosa", "Lisa", "Rizada"};
        String[] barkTextures = {"Rugosa", "Grisácea", "Oscura"};
        String[] colors = {"Verde", "Amarillo", "Rojo"};

        for (int i = 0; i < 1000; i++) {
            int x = rand.nextInt(1000);
            int y = rand.nextInt(1000);
            String name = names[rand.nextInt(names.length)];
            String leaf = leafTextures[rand.nextInt(leafTextures.length)];
            String bark = barkTextures[rand.nextInt(barkTextures.length)];
            String color = colors[rand.nextInt(colors.length)];

            forest.plantTree(x, y, name, leaf, bark, color);
        }

        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.printf("Memoria usada con Flyweight: %.2f MB%n", (endMemory - startMemory) / 1024.0 / 1024.0);
    }
}

