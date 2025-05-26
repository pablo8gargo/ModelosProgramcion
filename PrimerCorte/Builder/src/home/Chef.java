package home;

public class Chef {
    private BurguerBuilder burguerBuilder;

    public void setBurguerBuilder(BurguerBuilder burguerBuilder) {
        this.burguerBuilder = burguerBuilder;
    }

    public Burguer BurguerBuilder (){
        burguerBuilder.buildBread();
        burguerBuilder.buildCheese();
        burguerBuilder.buildMeat();
        burguerBuilder.buildToppings();
        return burguerBuilder.getBurguer();    
    }
}
