public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "pepperoni ";
    }
}
