public class CarsAssemble {
    private double perHourProducation = 221.0;
    public double productionRatePerHour(int speed) {      
        double baseRate = speed * perHourProducation;
        
        if (speed >= 1 && speed <= 4) {
            return baseRate;
        } else if (speed >= 5 && speed <= 8) {
            return baseRate * 0.9;
        } else if (speed == 9) {
            return baseRate * 0.8;
        } else if (speed == 10) {
            return baseRate * 0.77;
        }
        
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
