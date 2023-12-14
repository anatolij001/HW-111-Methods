import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //---   Задание № 1   ---
        System.out.println("---   Задание № 1   ---");
        checkYear(1988);
        //---   Задание № 2   ---
        System.out.println("---   Задание № 2   ---");
        selectVersion((byte) 0, 2023);
        //---   Задание № 3   ---
        System.out.println("---   Задание № 3   ---");
        int deliveryDay = willBeDelivered(163);
        if (deliveryDay<0){
            System.out.println("доставка не осуществляется.");
        }
        else System.out.println("Потребуется дней: "+deliveryDay);

    }

    //---   Задание № 1   ---
    public static void checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Год " + year + " високосный.\n");
            } else if (year % 400 == 0) {
                System.out.println("Год " + year + " високосный.\n");
            } else System.out.println("Год " + year + " не високосный.\n");
        } else System.out.println("Год " + year + " не високосный.\n");
    }

    //---   Задание № 2   ---
    public static void selectVersion(byte os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Установите версию приложения для iOS по ссылке\n");
    }

    //---   Задание № 3   ---
    public static int willBeDelivered(int distance) {
        int deliveryDay = 0;
        if (distance < 20) {
            deliveryDay = 1;
        } else if (distance >= 20 && distance < 60) {
            deliveryDay = 2;
        } else if (distance >= 60 && distance <= 100) {
            deliveryDay = 3;
        } else deliveryDay = -1;
        return deliveryDay;
    }
}