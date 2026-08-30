public class Lasagna {
   
    public static int expectedMinutesInOven(){
        return 40;
    }
    
    public static int remainingMinutesInOven(int minute){
        return expectedMinutesInOven() - minute;
    }
   
    public static int preparationTimeInMinutes(int layer){
        return 2 * layer;
    }
  
    public static int totalTimeInMinutes(int layers, int minutes){
        return  preparationTimeInMinutes(layers) + minutes;
    }
}
