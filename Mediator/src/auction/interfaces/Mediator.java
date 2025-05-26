package auction.interfaces;

import auction.components.Bidder;



public interface  Mediator {
    void notifyOffer(Bidder bidder, int offer);
    void notifyMinOffer();
    void notifySell(Bidder bidder);
}
