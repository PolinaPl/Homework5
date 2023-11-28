public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАДАЧА 1");

        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {
            System.out.println("Некорректные данные.");
        }
        System.out.println("ЗАДАЧА 2");

        byte clientOS1 = 1;
        int yearDevais = 2013;
        if (clientOS1 == 1 && yearDevais >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS1 == 1 && yearDevais < 2015) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке.");
        } else if (clientOS1 == 0 && yearDevais >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (clientOS1 == 0 && yearDevais < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS  по ссылке.");
        }

        System.out.println("ЗАДАЧА 3");
        int year = 2000;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год высокосный.");
        } else {
            System.out.println("Год не высокосный.");
        }

        System.out.println("ЗАДАЧА 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется двое суток.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется трое суток.");
        } else {
            System.out.println("Доставка не осуществляется.");
        }

        System.out.println("ЗАДАЧА 5");
        byte mounthNumber = 12;
        if (mounthNumber > 0 && mounthNumber < 13) {
            switch (mounthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Месяц принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц принадлежит сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц принадлежит сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц принадлежит сезону зима.");
                    break;

            }
        }


    }
}
