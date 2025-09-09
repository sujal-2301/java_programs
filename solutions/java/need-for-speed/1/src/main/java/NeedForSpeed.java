class NeedForSpeed {
    private int speed = 0;
    private int batteryDrain = 0;
    private int battery = 100;
    private int distance = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery < this.batteryDrain){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()){
            this.battery -= this.batteryDrain;
        distance += this.speed;
        }
        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance = 0;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       while(!car.batteryDrained()){
           car.drive();
           if(car.distanceDriven() >= this.distance){
               return true;
           }
       }
        return false;
        
    }
}
