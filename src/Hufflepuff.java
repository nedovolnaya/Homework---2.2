public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int distanceOfTransgression,
                      int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void printHufflepuffStats(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя:" + hufflepuff.getName() + " " +
                    "Сила магии:" + hufflepuff.getPowerOfMagic() + " " + "Трансгрессия:" + hufflepuff.getDistanceOfTransgression() + " "
                    + "Трудолюбие:" + hufflepuff.getIndustriousness() + " " + "Верность:" + hufflepuff.getLoyalty() + " "
                    + "Честность:" + hufflepuff.getHonesty());
        }
    }
    public static void compareHufflepuff(Hufflepuff first, Hufflepuff second, Hufflepuff third) {
        var firstPoints = first.getLoyalty() + first.getHonesty() + first.getIndustriousness();
        var secondPoints = second.getLoyalty() + second.getHonesty() + second.getIndustriousness();
        var thirdPoints = third.getLoyalty() + third.getHonesty() + third.getIndustriousness();

        if (firstPoints > secondPoints && firstPoints > thirdPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName() + " и " + third.getName());
        } else if (firstPoints < secondPoints && thirdPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName() + " и " + third.getName());
        } else if (thirdPoints > firstPoints && thirdPoints > secondPoints) {
            System.out.println("Студент " + third.getName() + " лучше чем " + first.getName() + " и " + second.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName() + " и " + third.getName() + " равны");
        }
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
