package structural.decorator;

public class Main {

    public static void main(String[] args) {
        
        BasePizza order1 = new ExtraCheese(new ExtraOnion(new VegDelight()));

        System.out.println("Cost of VegDelight Pizza with ExtraCheese & Extra Onion is : $"+order1.cost());


        BasePizza order2 = new ExtraMushroom(new ExtraOnion(new Chicken()));

        System.out.println("Cost of VegDelight Pizza with ExtraCheese & Extra Onion is : $"+order2.cost());

    }

}
