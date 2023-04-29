public class Ravenclaw extends Hogwarts {
    private static int intelligence;
    private static int wisdom;
    private static int wit;
    private static int creation;

    public Ravenclaw(String name, int powerOfMagic, int distanceOfTransgression, int intelligence,
                     int wisdom, int wit, int creation) {
        super(name, powerOfMagic, distanceOfTransgression);
        Ravenclaw.intelligence = intelligence;
        Ravenclaw.wisdom = wisdom;
        Ravenclaw.wit = wit;
        Ravenclaw.creation = creation;
    }

    public static void printRavenclawStats() {
        printCommonStats();
        System.out.println("ум:" + intelligence + " " + "мудрость:" + wisdom + " " + "остроумие:" + wit + " " +
                "творчество:" + creation);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
}
