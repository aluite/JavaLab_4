import java.util.Random;

public class TaxiService {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;

        for (int i = 1; i <= 16; i++) {
            Car car;
            int price;

            if (i % 2 == 0) {
                price = random.nextInt(151) + 450;
                car = new BusinessCar(price);
            } else {
                price = random.nextInt(151) + 150;
                car = new EconomCar(price);
            }

            int income = 0;
            for (int day = 1; day <= 5; day++) {
                int hours = random.nextInt(9);
                income += car.calculate(hours);
            }

            total += income;
            System.out.println("Машина " + i + ": доход за неделю = " + income + " руб.");
        }

        System.out.println("Доход таксопарка за неделю: " + total + " руб.");
    }
}
