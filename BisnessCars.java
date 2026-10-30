public class BusinessCar extends Car {
    public BusinessCar(int price) {
        super(price);
    }

    @Override
    public int calculate(int hours) {
        return price * hours;
    }
}
