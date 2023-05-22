public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }
    public static void compareAnyStudent(Hogwarts first, Hogwarts second) {
        var firstPoints = first.getPowerOfMagic() + first.getDistanceOfTransgression();
        var secondPoints = second.getPowerOfMagic() + second.getDistanceOfTransgression();

        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

}
