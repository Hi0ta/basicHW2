public class Main {
    public static void main(String[] args) {

        // Задача 1

        byte a = 126;
        short b = 32767;
        int c = 2147483647;
        long d = 2_147_483_648L;
        float f = 0.876_543_2f;
        double g = 0.321_321_321d;
        char h = 62;
        System.out.println("Примеры типов переменных. ");
        System.out.println("Целочисленные: ");
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        System.out.println("С плавающей точкой: ");
        System.out.println (f);
        System.out.println (g);
        System.out.println("Символы: ");
        System.out.println (h);

        //byte j = 10;
        //boolean l = j < 7;
        //System.out.println("Логические: ");
        //System.out.println (l);

        // Задача 2

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов= " + boxersWeight + " кг");

        float Weightdifference = boxer2 - boxer1;
        System.out.println("Разница в весе между двумя бойцами= " + Weightdifference + " кг");


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
        float weightBreakfastKg = weightBreakfastGr / 1000f;
        System.out.println("Вес спорт-завтрака= " + weightBreakfastGr + " грамм");
        System.out.println("Вес спорт-завтрака= " + weightBreakfastKg + " кг");

        // Задача 4

        int goalKg = 7;
        int goalGr = goalKg * 1000;
        int everyDayMin = 250;
        int everyDayMax = 500;
        int numberOfDaysMax = goalGr / everyDayMin;
        int numberOfDaysMin = goalGr / everyDayMax;
        System.out.println("Спортсмену для похудения понадобится максимум " + numberOfDaysMax + " дней");
        System.out.println("Спортсмену для похудения понадобится минимум " + numberOfDaysMin + " дней");
        int averageValueDays = (numberOfDaysMax + numberOfDaysMin) / 2;
        System.out.println("В среднем спортсмену для похудения необходим " + averageValueDays + " день");

        // Задача 5

        int salaryMashaInMonth = 67_760;
        int salaryDenisInMonth = 83_690;
        int salaryKristinaInMonth = 76_230;

        float salaryMashaInMonthAfterIncrease = salaryMashaInMonth + salaryMashaInMonth / 100f * 10;
        float salaryDenisAfterIncrease = salaryDenisInMonth + salaryDenisInMonth / 100f * 10;
        float salaryKristinaAfterIncrease = salaryKristinaInMonth + salaryKristinaInMonth / 100f * 10;

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
}