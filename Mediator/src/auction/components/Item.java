package auction.components;

import auction.interfaces.Collegue;
import auction.interfaces.Mediator;

public class Item extends Collegue{
    private final String name;
    private int price;

    public Item(Mediator mediator,String name, int price) {
        super(mediator);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
