public class StarUp implements Operator{

    private Vehicle vehicle;

    public StarUp (Vehicle vehicle){
        this.vehicle=vehicle;

    }

    @Override
    public void execute() {
        vehicle.starUp();
    }
}
