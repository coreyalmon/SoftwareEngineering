public class ChocolateDecorator extends CondimentDecorator
{
    public ChocolateDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDesc()
    {
        return " Chocolate " + this.beverage.getDesc();
    }

}
