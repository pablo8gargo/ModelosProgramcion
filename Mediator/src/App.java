import auction.AuctioneerMediator;
import auction.components.Bidder;
import auction.components.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    static List<Item> items = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        AuctioneerMediator mediator = new AuctioneerMediator();


        Bidder bidder1 = new Bidder(mediator, 1, random.nextInt(100, 200));
        Bidder bidder2 = new Bidder(mediator, 2, random.nextInt(100, 200));

        mediator.setBidder(bidder1);
        mediator.setBidder(bidder2);

        Item item = new Item(mediator, "Monalissa", 200);
        items.add(item);
        Item item2 = new Item(mediator, "Gold Clock", 300);
        items.add(item2);

        mediator.setItem(item);

        int numOffers = random.nextInt(3,20);

        int lastOffer = item.getPrice();
        for (int i = 0; i < numOffers; i++) {

            lastOffer = random.nextInt(lastOffer, (int)(1.25*lastOffer));
            if (i % 2 == 0) {
                bidder1.makeOffer(lastOffer);
            } else {
                bidder2.makeOffer(lastOffer);
            }
        }

        Bidder winner = (numOffers % 2 == 0) ? bidder2 : bidder1;
        mediator.notifySell(winner);
    }
}