class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    public int victories = 0;
    public int distance = 0;
    public void drive() {
        distance += 10;
    }


    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }
     @Override
        public int compareTo(ProductionRemoteControlCar other) {
            return Integer.compare(this.victories, other.victories);
        }
}



