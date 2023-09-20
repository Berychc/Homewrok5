public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//       task4();
//       task5();
    } public static void task1() {
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Error!");

//                Другой вариант решения задачи:
//                int clientOS = 0;
//                if (clientOS == 0){
//                    System.out.println("Установите версию приложения для iOS по ссылке");
//                } else if (clientOS == 1) {
//                    System.out.println("Установите версию приложения для Android по ссылке");
//                } else {
//                    System.out.println("Error!");
//                }
        }
    } public static void task2() {
        byte clientOS = 0;
        short clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Error!");
        }
//        Другой варинат решения задачи:
//        short clientOS = 2014;
//        String clientDeviceOS = "iOS";
//        switch (clientDeviceOS) {
//            case "iOS":
//                if (clientOS < 2015) {
//                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//                } else {
//                    System.out.println("Установите приложение для iOS");
//                }
//                break;
//            case "Android":
//                if (clientOS < 2015) {
//                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
//                } else {
//                    System.out.println("Установите приложение для Android");
//                }
//                break;
//            default:
//                System.out.println("Error!");
//                break;
//        }
    } public static void task3(){
        short year = 2023;
        if (year % 4 == 0){
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }
    } public static void task4(){
        byte deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.printf("Потребуется дней: %d", deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.printf("Потребуется дней: %d", deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryTime = 3;
            System.out.printf("Потребуется дней: %d", deliveryTime);
        } else {
            System.out.println("Доставки нету");
        }
    } public static void task5(){
        int monthNumber = 13;
        if (monthNumber > 12){
            System.out.println("Некорректный номер месяца");
        }
        String season;
        switch (monthNumber){
            case 12:
            case 1:
            case 2: season = "Зима";
                System.out.printf("Месяц номер %d принадлежит к сезону: %s",monthNumber , season);
                break;
            case 3:
            case 4:
            case 5: season = "Весна";
                System.out.printf("Месяц номер %d принадлежит к сезону: %s",monthNumber , season);
                break;
            case 6:
            case 7:
            case 8: season = "Лето";
                System.out.printf("Месяц номер %d принадлежит к сезону: %s",monthNumber , season);
                break;
            case 9:
            case 10:
            case 11: season = "Осень";
                System.out.printf("Месяц номер %d принадлежит к сезону: %s",monthNumber , season);
                break;
        }
    }
}