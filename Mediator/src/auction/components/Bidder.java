package auction.components;

import auction.interfaces.Collegue;
import auction.interfaces.Mediator;

public class Bidder extends  Collegue {
    private final int id;
    private int offer;

    public Bidder(Mediator mediator,int id, int offer) {
        super(mediator);
        this.offer = offer;
        this.id = id;
    }

    public void makeOffer(int offer) {
        this.offer = offer;
        mediator.notifyOffer(this, offer);
    }

    public int getId() {
        return id;
    }

    public int getOffer() {
        return offer;
    }
}
