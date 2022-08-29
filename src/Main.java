public class Main {
    public static void main(String[] args) {
        byte cat = 126;
        System.out.println("Значение переменной с типом byte равно " + cat);
        short dog = 32765;
        System.out.println("Значение переменной с типом short равно " + dog);
        int mousse = 232000;
        System.out.println("Значение переменной с типом int равно " + mousse);
        long pig = 1000000L;
        System.out.println(" Значение переменной с типом long равно " + pig);
        float bird = 37.15f;
        System.out.println(" Значение переменной с типом float равно " + bird);
        double apple = 307;
        System.out.println("Значение переменной с типом double равно " + apple);


        float a = 27.12f;
        System.out.println(a);
        long k = 987678965549L;
        System.out.println(k);
        byte b = 2;
        System.out.println(b);
        short c = 786;
        System.out.println(c);
        boolean d = 10 > 22;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        short j = 27897;
        System.out.println(j);
        byte h = 67;
        System.out.println(h);


        byte firstClass = 23;
        System.out.println(" У Людмилы Павловны " + firstClass + " ученика");
        byte secondClass = 27;
        System.out.println(" У Анна Сергеевны " + secondClass + " учеников");
        byte thirdClass = 30;
        System.out.println(" У Екатерины Андреевны " + thirdClass + " учеников");
        short totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + totalSheets / (firstClass + secondClass + thirdClass) + " листов бумаги");


        byte minutes = 2;
        byte botles = 16;
        byte minutes2 = 20;
        System.out.println("За " + minutes2 + " минут машина произвела бутылок " + botles * minutes2 / minutes + " штук");


        short day = 24;
        byte hours = 60;
        byte minutes1 = 2;
        byte botels2 = 16;
        int botlesDay = botels2 * hours / minutes1;
        System.out.println("За " + day + " часа машина произвела бутылок " + botlesDay * day + " штук");

        short oneDay = 24;
        byte Onehours = 60;
        byte TwoMinutes = 2;
        byte botels3 = 16;
        int botlesOneHours = botels3 * Onehours / TwoMinutes;
        int botlesOneDay = botlesOneHours * oneDay;
        short threeDay = 3;

        System.out.println(" За " + threeDay + " дня машина произвела бутылок " + botlesOneDay * threeDay + " штук ");


        short oneDay1 = 24;
        byte hours2 = 60;
        byte minutes3 = 2;
        byte botels4 = 16;
        int botlesDay1 = botels4 * hours2 / minutes3;
        int oneDay2 = botlesDay1 * oneDay1;
        short days = 30;
        System.out.println(" За " + days + " дней машина произвела бутылок " + oneDay2 * days + " штук ");


        byte allPaints = 120;
        byte brownPaints = 4;
        byte whitePains = 2;
        int classroom = allPaints / (brownPaints + whitePains);
        int allBrownPaints = classroom * brownPaints;
        int allWhitePaints = classroom * whitePains;
        System.out.println(" В школе, где " + classroom + " классов, нужно " + allWhitePaints + " банок белой краски и " + allBrownPaints + " банок коричневой краски ");

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        int weightBananas = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;
        int milkGrams = 100;

        int bananasGrams = bananas * weightBananas;
        int iceCreamGrams = iceCream * weightIceCream;
        int eggsGrams = eggs * weightEggs;
        int milkGrams3 = milk * weightMilk / milkGrams;

        float weightAllProducts = bananasGrams + iceCreamGrams + eggsGrams + milkGrams3;
        float onekg = 1000;
        float weightAllProductsKg = (weightAllProducts / onekg);
        System.out.println(" Вес завтрака " + weightAllProductsKg + "кг");


        int excessWeight = 7;
        short gramsPerDay1 = 250;
        short gramsPerDay2 = 500;
        float oneKg = 1000;
        float kgPerDay1 = (gramsPerDay1 / oneKg);
        float kgPerDay2 = (gramsPerDay2 / oneKg);
        float amountOfDay1 = (excessWeight / kgPerDay1);
        float amountOfDay2 = (excessWeight / kgPerDay2);
        byte numberOfValues = 2;
        float averageDays = (amountOfDay1 + amountOfDay2) / numberOfValues;
        System.out.println("Чтобы добиться результата похудения в среднем потребуется " + averageDays + " день ");

        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        float salaryIncrease = 0.1f;
        float salaryMasha = Masha * salaryIncrease;
        float salaryDenis = Denis * salaryIncrease;
        float salaryChristina = Christina * salaryIncrease;
        float increaseMonthMasha = Masha + salaryMasha;
        float increaseMonthDenis = Denis + salaryDenis;
        float increaseMonthChristina = Christina + salaryChristina;
        int oneYear = 12;
        float increasePerYearMasha = salaryMasha * oneYear;
        float increasePerYearDenis = salaryDenis * oneYear;
        float increasePerYearChristina = salaryChristina * oneYear;
        float differenceMasha = ( increaseMonthMasha * oneYear)  - ( Masha * oneYear);
        System.out.println( "Разница между годовым доходом Маши с нынешней зарплатой и после повышения составляет" + differenceMasha);
        System.out.println ("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + increasePerYearMasha );
        float differenceDenis = ( increaseMonthDenis * oneYear) - (Denis * oneYear);
        System.out.println( "Разница между годовым доходом Дениса с нынешней зарплатой и после повышения составляет" + differenceDenis);
        System.out.println ("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + increasePerYearDenis );
        float differenceChristina = ( increaseMonthChristina * oneYear) - ( Christina * oneYear);
        System.out.println( "Разница между годовым доходом Кристины с нынешней зарплатой и после повышения составляет" + differenceChristina);
        System.out.println ("Кристина теперь получает " + salaryChristina + " рублей. Годовой доход вырос на " + increasePerYearChristina);

    }
}