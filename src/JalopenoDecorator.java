public class JalopenoDecorator extends PizzaDecorator{
    public JalopenoDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "jalopeno ";
    }
}
