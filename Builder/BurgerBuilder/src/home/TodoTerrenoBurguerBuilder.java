package home;

public class TodoTerrenoBurguerBuilder implements BurguerBuilder {
    private Burguer burguer;

    public TodoTerrenoBurguerBuilder() {
        this.burguer = new Burguer();
        this.burguer.setName("Todo Terreno");
    }
    @Override

    public void buildMeat() {
        burguer.setMeat(new Meat("Dos carnes de res"));
    }
    @Override

    public void buildBread() {
        burguer.setBread(new Bread("Ajonjolí"));
    }

    @Override

    public void buildCheese() {
        burguer.setCheese(new Cheese("Mozzarella"));
    }

    @Override

    public void buildToppings() {
        burguer.addTopping(new Topping("Salsa BBQ"));
        burguer.addTopping(new Topping("Lechuga"));
        burguer.addTopping(new Topping("Cebolla"));
        burguer.addTopping(new Topping("Tomate"));
        burguer.addTopping(new Topping("Salsa Blanca"));
        burguer.addTopping(new Topping("Salsa de Tomate"));
        burguer.addTopping(new Topping("Salsa de Mostaza"));

    }
    
    @Override

    public Burguer getBurguer() {
        return this.burguer;
    }
 
}
