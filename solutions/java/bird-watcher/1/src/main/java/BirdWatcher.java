
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birds = birdsPerDay.clone();
        return birds;
    }

    public int getToday() {
        int[] birds =  getLastWeek();
        int today = birds.length - 1;

        return birds[today];
    }

 public void incrementTodaysCount() {
    int todayIndex = birdsPerDay.length - 1;
    birdsPerDay[todayIndex] = birdsPerDay[todayIndex] + 1;
}

    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay){
            if(i == 0){
                return true;
            }
        }return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        if(numberOfDays > birdsPerDay.length){
            for(int bird : birdsPerDay){
                sum += bird;
            }
        }else{
            for(int i = 0 ; i < numberOfDays; i++){
                sum = sum + birdsPerDay[i];
        }
        }
        
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for(int birds : birdsPerDay){
            if(birds >= 5){
                sum += 1;
            }          
        }return sum;
    }
}
