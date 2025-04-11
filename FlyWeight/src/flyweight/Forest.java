package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String leafTexture, String barkTexture, String color) {
        TreeType type = TreeFactory.getTreeType(name, leafTexture, barkTexture, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public int totalTrees() {
        return trees.size();
    }
}

