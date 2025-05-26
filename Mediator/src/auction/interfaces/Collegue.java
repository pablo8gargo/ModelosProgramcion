package auction.interfaces;

public abstract class Collegue {
    protected Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
