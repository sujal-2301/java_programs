import java.util.*;

public class TestTrack  {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
         if (cars == null) return new ArrayList<>();

        List<ProductionRemoteControlCar> ranked = new ArrayList<>(cars);
        
        ranked.sort(Comparator.comparingInt(ProductionRemoteControlCar::getNumberOfVictories).reversed());
        return ranked;
    }
}
