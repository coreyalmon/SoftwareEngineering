public class Main
{
    public static void main(String[] args)
    {
        Flyable fly = new Fly();
        Quackable quack = new Quack();


        Duck duck = new Duck(fly, quack);
        duck.fly();
        duck.quack();

    
        Flyable noFly = new NoFly();
        Duck rubberDuck = new Duck(noFly, quack);

        rubberDuck.fly();
        rubberDuck.quack();
    }
}
