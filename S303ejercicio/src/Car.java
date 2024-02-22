public class Car extends Vehicle{


    public Car(String name) {
        super(name);
    }

    @Override
    public void starUp() {
        System.out.println();
        System.out.println("El coche "+getName()+" está arrancando");

    }

    @Override
    public void speedUp() {
        System.out.println();
        System.out.println("El coche "+getName()+" está acelerando");

    }

    @Override
    public void brakeVehicle() {
        System.out.println();
        System.out.println("El coche "+getName()+" está frenando");

    }
}
