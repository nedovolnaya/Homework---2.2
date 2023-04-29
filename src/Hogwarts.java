public abstract class Hogwarts {
    private static String name;
    private static int powerOfMagic;
    private static int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        Hogwarts.name = name;
        Hogwarts.powerOfMagic = powerOfMagic;
        Hogwarts.distanceOfTransgression = distanceOfTransgression;
    }

    public static void printCommonStats() {
        System.out.print("имя:" + name + " " + "Сила магии:" + powerOfMagic + " " + "трансгрессия:" + distanceOfTransgression + " ");
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
