public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println(" Задача 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 1.1f;
        double f = 1.2;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача 2
        System.out.println(" Задача 2");
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        boolean j = false;
        int k = 569;
        short l = -159;
        short n = 27897;
        byte o = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(n);
        System.out.println(o);

        //Задача 3
        System.out.println(" Задача 3");
        short studentsLudmilaPavlovna = 23;
        System.out.println("Учеников у Людмилы Павловны " + studentsLudmilaPavlovna);
        short studentsAnnaSergeevna = 27;
        System.out.println("Учеников у Анны Сергеевны " + studentsAnnaSergeevna);
        short studentsEkaterinaAndreevna = 30;
        System.out.println("Учеников у Екатерины Андреевны " + studentsEkaterinaAndreevna);
        short sheet = 480;
        System.out.println("Всего листов на всех учеников  " + sheet);
        int allStudents = studentsAnnaSergeevna + studentsEkaterinaAndreevna + studentsLudmilaPavlovna;
        System.out.println("Всего учеников " + allStudents);
        int everybodySheet = sheet / allStudents;
        System.out.println("На каждого ученика рассчитано " + everybodySheet + " листов бумаги");

        // Задача 4
        System.out.println(" Задача 4");
        byte bootleMaking2min = 16;
        System.out.println("За 2 минуты машина произвела " + bootleMaking2min + " бутылок");
        int bootleMaking20min = bootleMaking2min * 10;
        System.out.println("За 20 минуты машина произвела " + bootleMaking20min + " бутылок");
        int bootleMaking1day = bootleMaking20min * 3 * 24;
        System.out.println("За сутки машина произвела " + bootleMaking1day + " бутылок");
        int bootleMaking3day = bootleMaking1day * 3;
        System.out.println("За 3 дня машина произвела " + bootleMaking3day + " бутылок");
        int bootleMaking1month = bootleMaking1day * 30;
        System.out.println("За месяц машина произвела " + bootleMaking1month + " бутылок");

        //Задача 5
        System.out.println(" Задача 5");
        byte allPaint = 120;
        System.out.println("Всего краски двух цветов: белой и коричневой " + allPaint + " банок");
        byte whitePaint = 2;
        System.out.println("На один класс уходит белой краски " + whitePaint + " банки");
        byte brownPaint = 4;
        System.out.println("На один класс уходит коричневой краски " + brownPaint + " банки");
        int oneClassroom = whitePaint + brownPaint;
        System.out.println("Краски на один класс уходит " + oneClassroom + " банок");
        int allClassroom = allPaint / oneClassroom;
        System.out.println("Всего " + allClassroom + " классов в школе " );
        int allWhitePaint = allClassroom * whitePaint;
        System.out.println("Всего белой краски " + allWhitePaint);
        int allBrownPaint = allClassroom * brownPaint;
        System.out.println("Всего коричневой краски " + allBrownPaint);
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

        // Задача 6
        System.out.println(" Задача 6");
        short banans = 5 * 80;
        short  milk = 100 * 105;
        short iceCream = 2 * 100;
        short chickenEgg = 4 * 70;
        float weightSportBreakfast = banans + milk + iceCream + chickenEgg;
        System.out.println("Вес спорт завтрака " + weightSportBreakfast + " грамм");
        float weightSportBreakfastKg = weightSportBreakfast / 1000;
        System.out.println("Вес спорт завтрака " + weightSportBreakfastKg + " килограмм");

        // Задача 7
        System.out.println(" Задача 7");
        double weightLose1 = 0.250;
        System.out.println("Потеря веса за один день " + weightLose1 + " кг. 1 способ");
        double weightLose2 = 0.5;
        System.out.println("Потеря веса за один день " + weightLose2 + " кг. 2 спопсоб");
        byte lose = 7;
        System.out.println("Надо скинуть " + lose + " кг");
        double firstWay = lose / weightLose1;
        System.out.println("За " + firstWay + " дней можно похудеть 1 способом");
        double secondWay = lose / weightLose2;
        System.out.println("За " + secondWay + " дней можно похудеть 2 способом");

        //Задача 8
        System.out.println(" Задача 8");
        int wageMasha = 67760;
        System.out.println("Зарплата до повышения " + wageMasha);
        int wageDenis = 83690;
        System.out.println("Зарплата до повышения " + wageDenis);
        int wageKristina = 76230;
        System.out.println("Зарплата до повышения " + wageKristina);
        int wageYearMasha = wageMasha * 12;
        System.out.println("Годовой доход Маши до повышения зарплаты " + wageYearMasha);
        int wageYearDenis = wageDenis * 12;
        System.out.println("Годовой доход Дениса до повышения зарплаты " + wageYearDenis);
        int wageYearKristina = wageKristina * 12 ;
        System.out.println("Годовой доход Кристины до повышения зарплаты " + wageYearKristina);
        int newWageMasha = wageMasha/100*110;
        int newWageDenis = wageDenis/100*110;
        int newWageKristina = wageKristina/100*110;
        int newWageYearMasha = newWageMasha * 12;
        int newWageYearDenis = newWageDenis * 12;
        int newWageYearKristina = newWageKristina * 12;
        int wageDifferenceMasha = newWageYearMasha - wageYearMasha;
        System.out.println("Маша теперь получает " + newWageMasha + " рублей. Годовой доход вырос на " + wageDifferenceMasha + " рублей");
        int wageDifferenceDenis = newWageYearDenis - wageYearDenis;
        System.out.println("Денис теперь получает " + newWageDenis + " рублей. годовой доход вырос на " + wageDifferenceDenis + " рублей");
        int wageDifferenceKristina = newWageYearKristina - wageYearKristina;
        System.out.println("Кристина теперь получает " + newWageKristina + " рублей. годовой доход вырос на " + wageDifferenceKristina + " рублей");


    }

}