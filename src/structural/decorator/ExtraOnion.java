package structural.decorator;

public class ExtraOnion extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraOnion (BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }

}
