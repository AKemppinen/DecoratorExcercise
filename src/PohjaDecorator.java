public class PohjaDecorator extends PizzaDecorator{
    public PohjaDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "pohja ";
    }
}
