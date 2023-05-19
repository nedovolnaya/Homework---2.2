public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int masterful;

    public Slytherin(String name, int powerOfMagic, int distanceOfTransgression, int trick, int determination,
                     int ambition, int inventiveness, int masterful) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.masterful = masterful;
    }

    public static void printSlytherinStats(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя:" + slytherin.getName() + " " +
                    "Сила магии:" + slytherin.getPowerOfMagic() + " " + "Трансгрессия:" + slytherin.getDistanceOfTransgression() + " "
                    + "Хитрость:" + slytherin.getTrick() + " " + "Решительность:" + slytherin.getDetermination() + " " + "Амбициозность:" + slytherin.getAmbition() +
                    "Находчивость: " + slytherin.getInventiveness() + " " + "Жажда власти: " + slytherin.getMasterful());
        }
    }
    public static void compareSlytherin(Slytherin first, Slytherin second, Slytherin third) {
        var firstPoints = first.getTrick() + first.getDetermination() + first.getAmbition() + first.getInventiveness() + first.getMasterful();
        var secondPoints = second.getTrick() + second.getDetermination() + second.getAmbition() + second.getInventiveness() + second.getMasterful();
        var thirdPoints = third.getTrick() + third.getDetermination() + third.getAmbition() + third.getInventiveness() + third.getMasterful();

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
