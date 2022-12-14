public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int month = 0;
        int contribution = 15_000;
        while (sum < 2_459_000) {
            sum = sum + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2022;
        int population = 12_000_000;
        while (year < 2022 + 10) {
            year++;
            int birthrate = population / 1_000 * 17;
            int mortality = population / 1_000 * 8;
            population = population + birthrate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15_000;
        double bet = 1.07;
        double goal = 12_000_000;
        int month = 0;
        while (sum < goal) {
            month++;
            sum = sum * bet;
            System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f рублей", sum);
            System.out.println();
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15_000;
        double bet = 1.07;
        double goal = 12_000_000;
        int month = 0;
        while (sum < goal) {
            month++;
            sum = sum * bet;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f рублей", sum);
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15_000;
        double bet = 1.07;
        int months = 0;
        int year = 9;
        int Totalmonth = 12 * year;
        while (months < Totalmonth) {
            months++;
            sum = sum * bet;
            if (months % 6 == 0) {
                System.out.printf("Месяц " + months + ", сумма накоплений равна %.2f рублей", sum);
                System.out.println();
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        int daysInAMonth = 31;
        do {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        } while (firstFriday < daysInAMonth);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2022;
        int yearComet = 79;
        int startYear = year - 200;
        int endYear = year + 100;
        while (startYear <= endYear) {
            startYear++;
            if (startYear % yearComet == 0) {
                System.out.println(startYear);
            }
        }
    }
}