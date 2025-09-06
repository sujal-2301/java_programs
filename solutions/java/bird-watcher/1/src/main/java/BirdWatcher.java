
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] week = new int[] {0, 2, 5, 3, 7, 8, 4};
        return week;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }
        

    public boolean hasDayWithoutBirds() {
        for(int num: birdsPerDay){
            if(num == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int summ = 0;
        numberOfDays = numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays;
        for(int i=0; i< numberOfDays; i++){
            summ += birdsPerDay[i];
        }
        return summ;
    }

    public int getBusyDays() {
        int count = 0;
        for(int num : birdsPerDay){
            if(num >= 5){
                count += 1;
            }
        }
        return count;
    }
}
