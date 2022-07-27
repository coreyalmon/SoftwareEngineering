public class Duck
{
    Flyable fly;
    Quackable quack;    

    Duck(Flyable fly, Quackable quack)
    {
        this.fly = fly;
        this.quack = quack;
    }

    public void fly()
    {
        fly.fly();
    }

    public void quack()
    {
        quack.quack();
    }

}
