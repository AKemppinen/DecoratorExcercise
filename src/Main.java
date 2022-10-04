public class Main {
    public static void main(String[] args) {
        Pizza pepperonipizza = new PepperoniDecorator( new TomaattikastikeDecorator( new PohjaDecorator(new SimplePizza())));
        Pizza mexicanapizza = new AnanasDecorator( new JalopenoDecorator(new PepperoniDecorator( new TomaattikastikeDecorator( new PohjaDecorator(new SimplePizza())))));
        Pizza spicypepperonipizza = new JalopenoDecorator( new PunasipuliDecorator(new PepperoniDecorator( new TomaattikastikeDecorator( new PohjaDecorator(new SimplePizza())))));
        System.out.println("Pepperonipizza: " + pepperonipizza.getDescription() + pepperonipizza.getPrice() + "€");
        System.out.println("Mexicanapizza: " + mexicanapizza.getDescription() + mexicanapizza.getPrice() + "€");
        System.out.println("Spicypepperonipizza: " + spicypepperonipizza.getDescription() + spicypepperonipizza.getPrice() + "€");
    }
}
