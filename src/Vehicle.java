abstract public class Vehicle
{
    private int wheels;
    private int speed;
    public Vehicle(int wheels, int speed)
    {
        this.wheels = wheels;
        this.speed = speed;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void move()
    {
        System.out.println("This vehicle is moving");
    }

    abstract public void speed();
}
