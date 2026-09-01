
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for(int num : birdsPerDay){
            if(num == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0 ; i < daysToCount ; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int num : birdsPerDay) {
            if(num >= 5)
                busyDays++;
        }
        return busyDays;
    }
}
