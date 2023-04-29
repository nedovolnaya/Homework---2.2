public class Hufflepuff extends Hogwarts {
    private static int industriousness;
    private static int loyalty;
    private static int honesty;

    public Hufflepuff(String name, int powerOfMagic, int distanceOfTransgression,
                      int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        Hufflepuff.industriousness = industriousness;
        Hufflepuff.loyalty = loyalty;
        Hufflepuff.honesty = honesty;
    }

    public static void printHufflepuffStats() {
        printCommonStats();
        System.out.println("трудолюбие:" + industriousness + " " + "верность:" + loyalty + " " + "честность:" + honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
