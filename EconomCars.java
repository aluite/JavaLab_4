public class EconomCar extends Car {
    public EconomCar(int price) {
        super(price);
    }

    @Override
    public int calculate(int hours) {
        return price * hours;
    }
}
