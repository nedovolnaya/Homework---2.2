public class Gryffindor extends Hogwarts {
    private static int nobility;
    private static int honor;
    private static int bravery;

    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honor, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        Gryffindor.nobility = nobility;
        Gryffindor.honor = honor;
        Gryffindor.bravery = bravery;
    }

    public static void printGryffindorStats() {
        printCommonStats();
        System.out.println("благородство:" + nobility + " " + "честь:" + honor + " " + "храбрость:" + bravery);
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
