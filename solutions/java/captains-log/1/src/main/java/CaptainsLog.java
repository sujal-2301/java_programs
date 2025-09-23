import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        int regNo = random.nextInt(1000, 10000);
        return "NCC-" + regNo;
    }

    double randomStardate() {
        double startDate = random.nextDouble(1000);
        return 41000 + startDate;
    }
}
