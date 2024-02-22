public class SpeedUp implements  Operator{

        private Vehicle vehicle;

        public SpeedUp (Vehicle vehicle){
            this.vehicle=vehicle;

        }

        @Override
        public void execute() {
            vehicle.speedUp();
        }
}


