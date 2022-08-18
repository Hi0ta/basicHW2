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
        // Задача 1
        byte a = 126;
        short b = 32767;
        int c = 2147483647;
        long d = 2_147_483_648L;
        float f = 0.876_543_2f;
        double g = 0.321_321_321;
        char h = 62;
        System.out.println("Примеры типов переменных. ");
        System.out.println("Целочисленные: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("С плавающей точкой: ");
        System.out.println(f);
        System.out.println(g);
        System.out.println("Символы: ");
        System.out.println(h);
        boolean l = false;
        System.out.println("Логические: ");
        System.out.println(l);
    }

    public static void task2() {
        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        //double boxersWeight = boxer1 + boxer2;
        // System.out.println("Общий вес двух бойцов= " + boxersWeight + " кг");
        System.out.println("Общий вес двух бойцов= " + (boxer1 + boxer2) + " кг");
        //double WeightDifference = boxer2 - boxer1;
        //double WeightDifference = Math.abs(boxer2 - boxer1);
        //System.out.println("Разница в весе между двумя бойцами= " + WeightDifference + " кг");
        System.out.println("Разница в весе между двумя бойцами= " + Math.abs(boxer2 - boxer1) + " кг");
    }

    public static void task3() {

        // Задача 3

        int bananas = 5;
        int bananWeight = 80;
        int bananasWeight = bananas * bananWeight;
        int milkMl = 200;
        int milkGr = milkMl / 100 * 105;
        int iceCream = 2;
        int iceCreamWeight = iceCream * 100;
        int eggs = 4;
        int eggsWeight = eggs * 70;
        int weightBreakfastGr = bananasWeight + milkGr + iceCreamWeight + eggsWeight;
        double weightBreakfastKg = weightBreakfastGr / (1000 * 1.0);
        System.out.println("Вес спорт-завтрака= " + weightBreakfastGr + " грамм");
        System.out.println("Вес спорт-завтрака= " + weightBreakfastKg + " кг");
    }

    public static void task4() {
        // Задача 4

        int goalKg = 7;
        int goalGr = goalKg * 1000;
        int everyDayMin = 250;
        int everyDayMax = 500;
        int numberOfDaysMax = goalGr / everyDayMin;
        int numberOfDaysMin = goalGr / everyDayMax;
        System.out.println("Спортсмену для похудения понадобится максимум " + numberOfDaysMax + " дней");
        System.out.println("Спортсмену для похудения понадобится минимум " + numberOfDaysMin + " дней");
        // double averageValueDays = (numberOfDaysMax + numberOfDaysMin) / (2 * 1.0);
        double averageValueDays = goalGr / ((everyDayMax + everyDayMin) / (2 * 1.0));
        System.out.println("В среднем спортсмену для похудения необходим " + averageValueDays + " день");
    }

    public static void task5() {
        // Задача 5

        int salaryMashaInMonth = 67_760;
        int salaryDenisInMonth = 83_690;
        int salaryKristinaInMonth = 76_230;

        //float salaryMashaInMonthAfterIncrease = salaryMashaInMonth + salaryMashaInMonth / 100f * 10;
        // float salaryDenisAfterIncrease = salaryDenisInMonth + salaryDenisInMonth / 100f * 10;
        //float salaryKristinaAfterIncrease = salaryKristinaInMonth + salaryKristinaInMonth / 100f * 10;
        float indexPercent = 1.1f;
        float salaryMashaInMonthAfterIncrease = salaryMashaInMonth * indexPercent;
        float salaryDenisAfterIncrease = salaryDenisInMonth * indexPercent;
        float salaryKristinaAfterIncrease = salaryKristinaInMonth * indexPercent;

        System.out.println("После повышения Маша будет получать " + salaryMashaInMonthAfterIncrease + " руб. в месяц");
        System.out.println("После повышения Денис будет получать " + salaryDenisAfterIncrease + " руб. в месяц");
        System.out.println("После повышения Кристина будет получать " + salaryKristinaAfterIncrease + " руб. в месяц");

        float salaryMashaInYearAfterIncrease = salaryMashaInMonthAfterIncrease * 12;
        float salaryDenisInYearAfterIncrease = salaryDenisAfterIncrease * 12;
        float salaryKristinaInYearAfterIncrease = salaryKristinaAfterIncrease * 12;

        int salaryMashaInYear = salaryMashaInMonth * 12;
        int salaryDenisInYear = salaryDenisInMonth * 12;
        int salaryKristinaInYear = salaryKristinaInMonth * 12;

        float increaseInAnnualSalaryIncomeMasha = salaryMashaInYearAfterIncrease - salaryMashaInYear;
        float increaseInAnnualSalaryIncomeDenis = salaryDenisInYearAfterIncrease - salaryDenisInYear;
        float increaseInAnnualSalaryIncomeKristina = salaryKristinaInYearAfterIncrease - salaryKristinaInYear;

        System.out.println("Годовой доход Маши вырастет на " + increaseInAnnualSalaryIncomeMasha + " руб.");
        System.out.println("Годовой доход Дениса вырастет на " + increaseInAnnualSalaryIncomeDenis + " руб.");
        System.out.println("Годовой доход Кристины вырастет на " + increaseInAnnualSalaryIncomeKristina + " руб.");

    }

    public static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result * (-1));
    }

    public static void task7() {
        int a = 5;
        int b = 7;
        a = a * b / a;
        b = (a + a + a + a + a) / a;
        System.out.println("a=" + a + ", b=" + b);
    }

    public static void task8() {
        int a = 726;
        int b = a / 10;
        b %= 10;
        System.out.println(b);

    }
}