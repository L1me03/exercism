import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);

        return PLANET_CLASSES[index];
        
    }

    String randomShipRegistryNumber() {
        String prefix = "NCC";
        String split = "-";
        int number = 1000 + random.nextInt(9000);

        return prefix + split + number;

        
    }

    double randomStardate() {
        double min = 41000;
        double max = 42000;
        
        return min + (max - min) * random.nextDouble();}
}
