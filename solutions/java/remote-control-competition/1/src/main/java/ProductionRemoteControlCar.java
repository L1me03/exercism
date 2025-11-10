class ProductionRemoteControlCar implements RemoteControlCar,  Comparable<ProductionRemoteControlCar> {

    public int distanceTravelled = 0;

    public int numberOfVictories = 0;
    
    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

        public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories); 
    }
}
