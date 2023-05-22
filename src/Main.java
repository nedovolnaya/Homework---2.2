public class Main {

    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гермиона Грейнжер", 88, 68, 80, 90, 92),
                new Gryffindor("Рон Уизли", 79, 78, 66, 78, 66),
                new Gryffindor("Гарри Поттер", 90, 76, 78, 90, 95),
        };


        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 79, 78, 87, 67, 85, 80, 79),
                new Slytherin("Грэхэм Монтегю", 67, 87, 67, 76, 66, 56, 62),
                new Slytherin("Грегори Гойл", 55, 60, 78, 45, 76, 55, 56),
        };


        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 66, 76, 45, 87, 58, 77),
                new Ravenclaw("Падма Патил", 88, 76, 66, 45, 90, 99),
                new Ravenclaw("Маркус Белби", 90, 78, 45, 55, 50, 45),
        };


        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 45, 67, 78, 88, 80),
                new Hufflepuff("Седрик Диггори", 77, 79, 80, 88, 89),
                new Hufflepuff("Джастин Финч-Флетчли", 70, 60, 60, 66, 66),
        };


        PrintService printService = new PrintService();
        PrintService.print(gryffindors);
        PrintService.print(slytherins);
        PrintService.print(hufflepuffs);
        PrintService.print(ravenclaws);

        Gryffindor.compareGryffindors(gryffindors[0], gryffindors[1], gryffindors[2]);
        Slytherin.compareSlytherin(slytherins[0], slytherins[1], slytherins[2]);
        Ravenclaw.compareRavenclaw(ravenclaws[0], ravenclaws[1], ravenclaws[2]);
        Hufflepuff.compareHufflepuff(hufflepuffs[0], hufflepuffs[1], hufflepuffs[2]);
        Hogwarts.compareAnyStudent(gryffindors[0], slytherins[1]);
    }

}

