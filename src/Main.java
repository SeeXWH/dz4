public class Main {
    public static void main(String[] args) {
        // task 1
        int age = 12;
        if (age >= 18) System.out.println("Если возраст человека равен " + age + ", то он совершенолетний");
        else System.out.println("Если возраст человека равен " + age + ", то он несовершенолетний");
        //task 2
        int temperature = 12;
        if (temperature < 5) System.out.println("На улице " + temperature + " нужно надеть шапку");
        else System.out.println("На улице " + temperature + " можно идти без шапки");
        // task 3
        int speed = 12;
        if (temperature > 60) System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        // task 4
        int people = 12;
        if (people > 2 && people < 6)
            System.out.println("Если возраст человека равен " + people + ", то ему нужно ходить в десткий сад");
        else if (people > 7 && people < 17)
            System.out.println("Если возраст человека равен " + people + ", то ему нужно ходить в школу");
        else if (people >= 18 && people <= 24)
            System.out.println("Если возраст человека равен " + people + ", то его место в универе");
        else if (people > 24)
            System.out.println("Если возраст человека равен" + people + ", то ему пора ходить на работу");
        // task 5
        int baby = 12;
        if (baby < 5)
            System.out.println("Если возраст ребенка равен " + baby + ", то ему нельзя кататься на аттракционе");
        else if (baby < 14 && baby > 5)
            System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционе в сопровождении");
        else if (baby > 14)
            System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        // task 6
        int van = 102;
        int sit = 60;
        int stay = van - sit;
        int passenger = 12;
        if (passenger < sit) System.out.println("В вагоне есть сидячее место");
        else if (passenger >= sit && passenger < van) System.out.println("В вагоне нет сидячих, но есть стоячие места");
        else System.out.println("В вагоне нет мест!");
        // task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) System.out.println("one");
        else if (two >=one && two >= three) System.out.println("two");
        else System.out.println("three");
    }
}