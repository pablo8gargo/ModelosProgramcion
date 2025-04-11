package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String leafTexture, String barkTexture, String color) {
        String key = name + ":" + leafTexture + ":" + barkTexture + ":" + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, leafTexture, barkTexture, color));
        }
        return treeTypes.get(key);
    }
}
