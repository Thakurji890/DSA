public interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}

// public class ProductionRemoteControlCar implements RemoteControlCar {
//     private int distance = 0;

//     public void drive() {
//         this.distance += 10;
//     }

//     public int getDistanceTravelled() {
//         return distance;
//     }
// }

// public class ExperimentalRemoteControlCar implements RemoteControlCar {
//     private int distance = 0;

//     public void drive() {
//         this.distance += 20;
//     }

//     public int getDistanceTravelled() {
//         return distance;
//     }
// }