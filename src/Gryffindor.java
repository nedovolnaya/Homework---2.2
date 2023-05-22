public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honor, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareGryffindors(Gryffindor first, Gryffindor second, Gryffindor third) {
        var firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
        var secondPoints = second.getBravery() + second.getHonor() + second.getNobility();
        var thirdPoints = third.getBravery() + third.getHonor() + third.getNobility();

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

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
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
