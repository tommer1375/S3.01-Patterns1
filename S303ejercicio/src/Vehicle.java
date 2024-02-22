abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void starUp();

    public abstract void speedUp();

    public abstract void brakeVehicle();

}


