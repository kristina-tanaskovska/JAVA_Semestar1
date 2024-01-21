public abstract class AbstractCaj {
    private String color;
    private int timeBoiling;
    private int timeToMake;
    private String miris;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTimeBoiling() {
        return timeBoiling;
    }

    public void setTimeBoiling(int timeBoiling) {
        this.timeBoiling = timeBoiling;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(int timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String getMiris() {
        return miris;
    }

    public void setMiris(String miris) {
        this.miris = miris;
    }
    //constructor
    public AbstractCaj(){

    }

    public static void main(String[] args) {
        Kamilica kam = new Kamilica("sfd",32);
        kam.setMiris("ubav");
        System.out.println("mirisot e "+kam.getMiris());
    }

}
