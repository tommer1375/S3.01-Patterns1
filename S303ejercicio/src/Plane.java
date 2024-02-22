public class Plane extends Vehicle{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void starUp() {
        System.out.println("El avión "+getName()+" está arrancando");

    }

    @Override
    public void speedUp() {
        System.out.println("El avión "+getName()+" está acelerando");

    }

    @Override
    public void brakeVehicle() {
        System.out.println("El avión "+getName()+" está frenando");

    }
}
