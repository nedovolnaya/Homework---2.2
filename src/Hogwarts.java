public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
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
