public class Ship extends Vehicle{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void starUp() {
        System.out.println("El barco "+getName()+" está arrancando");

    }

    @Override
    public void speedUp() {
        System.out.println("El barco "+getName()+" está acelerando");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("El barco "+getName()+" está frenando");

    }
}
