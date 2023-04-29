public class Main {


    public static void main(String[] args) {
        Gryffindor germiona = new Gryffindor("Гермиона Грейнжер", 85, 67, 88, 90, 92);
        Gryffindor.printGryffindorStats();

        Gryffindor ron = new Gryffindor("Рон Уизли", 79, 78, 66, 78, 66);
        Gryffindor.printGryffindorStats();

        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 76, 78, 90, 95);
        Gryffindor.printGryffindorStats();
        System.out.println();


        Slytherin draco = new Slytherin("Драко Малфой", 79, 78, 87, 67, 85, 80, 79);
        Slytherin.printSlytherinStats();

        Slytherin graham = new Slytherin("Грэхэм Монтегю", 67, 87, 67, 76, 66, 56, 62);
        Slytherin.printSlytherinStats();

        Slytherin gregory = new Slytherin("Грегори Гойл", 55, 60, 78, 45, 76, 55, 56);
        Slytherin.printSlytherinStats();
        System.out.println();


        Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 66, 76, 45, 87, 58, 77);
        Ravenclaw.printRavenclawStats();

        Ravenclaw padma = new Ravenclaw("Падма Патил", 88, 76, 66, 45, 90, 99);
        Ravenclaw.printRavenclawStats();

        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 90, 78, 45, 55, 50, 45);
        Ravenclaw.printRavenclawStats();
        System.out.println();

        Hufflepuff zacharia = new Hufflepuff("Захария Смит", 45, 67, 78, 88, 80);
        Hufflepuff.printHufflepuffStats();

        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 77, 79, 80, 88, 89);
        Hufflepuff.printHufflepuffStats();

        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 70, 60, 60, 66, 66);
        Hufflepuff.printHufflepuffStats();
    }

}

