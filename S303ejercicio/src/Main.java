public class Main {
    public static void main(String[] args) {

            Car newcar = new Car("Aston Martin AMR24");
            Plane newplane = new Plane ("Lockheed Martin F-16");
            Ship newship = new Ship ("USS Gerald R. Ford (CVN-78)");
            Bicycle newbicycle = new Bicycle("Pinarello DOGMA F DURA");

            StarUp doStarUpC = new StarUp(newcar);
            StarUp doStarUpP = new StarUp(newplane);
            StarUp doStarUpS = new StarUp(newship);
            StarUp doStarUpB = new StarUp(newbicycle);

            SpeedUp doSpeedUpC = new SpeedUp(newcar);
            SpeedUp doSpeedUpP = new SpeedUp(newplane);
            SpeedUp doSpeedUpS = new SpeedUp(newship);
            SpeedUp doSpeedUpB = new SpeedUp(newbicycle);

            BrakeVehicle doBrakeC = new BrakeVehicle(newcar);
            BrakeVehicle doBrakeP = new BrakeVehicle(newplane);
            BrakeVehicle doBrakeS = new BrakeVehicle(newship);
            BrakeVehicle doBrakeB = new BrakeVehicle(newbicycle);

            Parking parking = new Parking();

            parking.receiveOperations(doStarUpC);
            parking.receiveOperations(doStarUpP);
            parking.receiveOperations(doStarUpS);
            parking.receiveOperations(doStarUpB);

            parking.receiveOperations(doSpeedUpC);
            parking.receiveOperations(doSpeedUpP);
            parking.receiveOperations(doSpeedUpS);
            parking.receiveOperations(doSpeedUpB);

            parking.receiveOperations(doBrakeC);
            parking.receiveOperations(doBrakeP);
            parking.receiveOperations(doBrakeS);
            parking.receiveOperations(doBrakeB);


            parking.doingOperations();






    }
}