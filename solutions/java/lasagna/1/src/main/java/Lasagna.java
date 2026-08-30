public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minute){
        return 40 - minute;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layer){
        return 2 * layer;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int minutes){
        return (2*layers) + minutes;
    }
}
