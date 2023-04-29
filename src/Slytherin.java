public class Slytherin extends Hogwarts {
    private static int trick;
    private static int determination;
    private static int ambition;
    private static int inventiveness;
    private static int masterful;

    public Slytherin(String name, int powerOfMagic, int distanceOfTransgression, int trick, int determination,
                     int ambition, int inventiveness, int masterful) {
        super(name, powerOfMagic, distanceOfTransgression);
        Slytherin.trick = trick;
        Slytherin.determination = determination;
        Slytherin.ambition = ambition;
        Slytherin.inventiveness = inventiveness;
        Slytherin.masterful = masterful;
    }

    public static void printSlytherinStats() {
        printCommonStats();
        System.out.println("хитрость:" + trick + " " + "решительность:" + determination + " " + "амбициозность:"
                + ambition + " " + "находчивость:" + inventiveness + " " + "жажда власти:" + masterful);
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getMasterful() {
        return masterful;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", masterful=" + masterful +
                '}';
    }
}
