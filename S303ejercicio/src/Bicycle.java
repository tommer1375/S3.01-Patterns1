public class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void starUp() {
        System.out.println("La bicicleta "+getName()+" está arrancando");
    }

    @Override
    public void speedUp() {
        System.out.println("La bicileta "+getName()+" está acelerando");

    }

    @Override
    public void brakeVehicle() {
        System.out.println("La bicicleta "+getName()+" está frenando");

    }
}
