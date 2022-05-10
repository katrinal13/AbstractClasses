public class Car extends Vehicle
{
    public Car(int wheels, int speed)
    {
        super(wheels, speed);
    }

    public void speed()
    {
        System.out.println("This car is going at " + getSpeed() + " miles per hour");
    }
}
