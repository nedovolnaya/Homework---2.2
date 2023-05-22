public class PrintService {
    public static void print(Gryffindor[] gryffindors) {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Имя:" + gryffindor.getName() + " " +
                    "Сила магии:" + gryffindor.getPowerOfMagic() + " " + "Трансгрессия:" +
                    gryffindor.getDistanceOfTransgression() + " "
                    + "Благородство:" + gryffindor.getNobility() + " " + "Честь:" + gryffindor.getHonor() + " "
                    + "Храбрость:" + gryffindor.getBravery());
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя:" + slytherin.getName() + " " +
                    "Сила магии:" + slytherin.getPowerOfMagic() + " " + "Трансгрессия:" + slytherin.getDistanceOfTransgression()
                    + " " + "Хитрость:" + slytherin.getTrick() + " " + "Решительность:" + slytherin.getDetermination() + " "
                    + "Амбициозность:" + slytherin.getAmbition() +
                    "Находчивость: " + slytherin.getInventiveness() + " " + "Жажда власти: " + slytherin.getMasterful());
        }
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя:" + hufflepuff.getName() + " " +
                    "Сила магии:" + hufflepuff.getPowerOfMagic() + " " + "Трансгрессия:" + hufflepuff.getDistanceOfTransgression() + " "
                    + "Трудолюбие:" + hufflepuff.getIndustriousness() + " " + "Верность:" + hufflepuff.getLoyalty() + " "
                    + "Честность:" + hufflepuff.getHonesty());
        }
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя:" + ravenclaw.getName() + " " + "Сила магии:" +
                    ravenclaw.getPowerOfMagic() + " " + "Трансгрессия:" + ravenclaw.getDistanceOfTransgression() + " "
                    + "Ум:" + ravenclaw.getIntelligence() + " " + "Мудрость:" + ravenclaw.getWisdom() + " "
                    + "Остроумие:" + ravenclaw.getWit() + "Творчество:" + ravenclaw.getCreation());
        }
    }

}
