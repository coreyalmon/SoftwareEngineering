public class CaramelDecorator extends CondimentDecorator
{
    public CaramelDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDesc()
    {
        return " Caramel " + this.beverage.getDesc();
    }

}
