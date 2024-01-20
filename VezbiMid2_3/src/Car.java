public abstract class Car {
    float consumtion;
    int distance;
    float price;
    public abstract void Car(){
        this.consumtion = consumtion;
        this.distance = distance;
    }
    public abstract makeNoise();
    public abstract int price(){
        price = consumtion/distance;
        return (int) price;
    }
    public void toStr(){
        System.out.println("Consumption: "+ consumtion);
        System.out.println("Distance: "+ distance);
        System.out.println("Price: "+ price);
    }
}
