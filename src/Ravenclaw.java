public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int powerOfMagic, int distanceOfTransgression, int intelligence,
                     int wisdom, int wit, int creation) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public static void printRavenclawStats(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя:" + ravenclaw.getName() + " " + "Сила магии:" +
                    ravenclaw.getPowerOfMagic() + " " + "Трансгрессия:" + ravenclaw.getDistanceOfTransgression() + " "
                    + "Ум:" + ravenclaw.getIntelligence() + " " + "Мудрость:" + ravenclaw.getWisdom() + " "
                    + "Остроумие:" + ravenclaw.getWit() + "Творчество:" + ravenclaw.getCreation());
        }
    }
    public static void compareRavenclaw(Ravenclaw first, Ravenclaw second, Ravenclaw third) {
        var firstPoints = first.getIntelligence() + first.getWisdom() + first.getWit() + first.getCreation();
        var secondPoints = second.getIntelligence() + second.getWisdom() + second.getWit() + second.getCreation();
        var thirdPoints = third.getIntelligence() + third.getWisdom() + third.getWit() + third.getCreation();

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
