public abstract class vehicle {
    String color;
    int wheels;
    public abstract String getColor();
/*
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }*/

    public vehicle(String color, int wheels){
        this.color = color;
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        truck t = new truck("Yelow", 4, 32);
        Enguine e = new Enguine("Black", 1);
        /*t.setColor("Yelow");
        e.setColor("White");
        System.out.println("Color: "+e.getColor());
        System.out.println("Color: "+e.getWheels());
*/
    }

}
