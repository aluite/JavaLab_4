public abstract class Car {
    protected int price;

    public Car(int price) {
        this.price = price;
    }

    public abstract int calculate(int hours);
}
