public class truck extends vehicle{
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    int loadCapacity;
    public  truck(String color, int wheels, int loadCapacity){
        super(color,wheels);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public String getColor() {
        color = "Red";
        return null;
    }
}
