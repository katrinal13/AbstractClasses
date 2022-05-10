public class Runner
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Car(4, 50);
        vehicle.speed();
        vehicle.move();
        Vehicle vehicle1 = new Plane(4, 740);
        vehicle1.speed();
        vehicle1.move();
    }
}
