public class CarsAssemble {
    public int successRate = 100;
    
    public double productionRatePerHour(int speed) {
        if(speed >= 1 && speed <= 4){
            successRate = 100;
        }
        else if(speed >= 5 && speed <= 8){
            successRate = 90;
        }
        else if(speed == 9){
            successRate = 80;
        }
        else{
            successRate = 77;
        }
        
        return (double)(221 * speed * successRate)/100;
    }

    public int workingItemsPerMinute(int speed) {
        double rate = productionRatePerHour(speed);
        int ans = (int)rate/60;
        return ans;
    }
}
