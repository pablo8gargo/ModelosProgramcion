package auction;

import auction.components.Bidder;
import auction.components.Item;
import auction.interfaces.Mediator;
import java.util.List;

public class AuctioneerMediator implements Mediator{
    private Item item;
    List<Bidder> bidders = new java.util.ArrayList<>();
    

    public void setBidder(Bidder bidder) {
        this.bidders.add(bidder);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void notifyOffer(Bidder bidder, int offer){
        System.out.println("Offer received  " + bidder.getId() + ": " + offer);

        if (offer > item.getPrice()) {
            System.out.println("Offer accepted.");
            item.setPrice(offer);
        } else {
            System.out.println("Offer rejected. Minimum offer is " + item.getPrice());
            notifyMinOffer();
        }
        
    }

    
    @Override
    public void notifyMinOffer(){
        System.out.println("Minimum offer notification: ");
        for (Bidder bidder : bidders) {
            System.out.println("Bidder " + bidder.getId() + " made an offer of " + bidder.getOffer());
        }
    }

    @Override
    public void notifySell(Bidder bidder){
        System.out.println("Item " + item.getName() + " sold to Bidder " + bidder.getId() + " for " + bidder.getOffer());
    }


}
