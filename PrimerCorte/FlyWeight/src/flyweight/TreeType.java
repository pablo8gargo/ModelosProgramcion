package flyweight;

public class TreeType {
    private String name;
    private String leafTexture;
    private String barkTexture;
    private String color;

    public TreeType(String name, String leafTexture, String barkTexture, String color) {
        this.name = name;
        this.leafTexture = leafTexture;
        this.barkTexture = barkTexture;
        this.color = color;
    }

    public String getName() {
        return name;
    }
}


