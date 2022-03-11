
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] last={0, 2, 5, 3, 7, 8, 4};
        return last;
    }

    public int getToday() {
        return this.birdsPerDay.length==0?0:this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int day:this.birdsPerDay){
            if (day ==0)return true;

        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] lastWeek=this.birdsPerDay;
        int sum=0;
        for(int i=0;i<numberOfDays && i<7;i++){
            sum+=lastWeek[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum=0;
            for(int day:this.birdsPerDay){
                if(day>=5)sum++;
            }
            return sum;
    }
}
