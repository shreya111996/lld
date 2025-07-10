package structural.decorator;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza; // Holds the pizza being decorated (could be base or another topping)
    // Needed to delegate cost() and add this topping's cost

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {

        return this.basePizza.cost() + 20;

    }

}
