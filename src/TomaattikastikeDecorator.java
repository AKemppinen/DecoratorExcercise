public class TomaattikastikeDecorator extends PizzaDecorator{
    public TomaattikastikeDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "tomaattikastike ";
    }
}
