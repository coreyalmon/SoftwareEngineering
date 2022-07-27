public class Main
{
    public static void main(String[] args)
    {
        Beverage beverage = new CaramelDecorator(new ChocolateDecorator(new Espresso()));
        System.out.println(beverage.getDesc());
        
        beverage = new ChocolateDecorator(new CaramelDecorator(new Decaf()));
        System.out.println(beverage.getDesc());
    
    }
}
