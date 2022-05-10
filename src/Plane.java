public class Plane extends Vehicle
{
    public Plane(int wheels, int speed)
    {
        super(wheels, speed);
    }

    public void speed()
    {
        System.out.println("This plane is going at " + getSpeed() + " kilometers per hour");
    }
}
