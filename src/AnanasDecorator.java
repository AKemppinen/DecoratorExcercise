public class AnanasDecorator extends PizzaDecorator{
    public AnanasDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "ananas ";
    }
}
