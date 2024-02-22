public class BrakeVehicle implements Operator{

        private Vehicle vehicle;

        public BrakeVehicle (Vehicle vehicle){
            this.vehicle=vehicle;

        }

        @Override
        public void execute() {
            vehicle.brakeVehicle();
        }
}

