public class Balsamic extends Plant {
    String taste;
    public Balsamic(){
        super();
    }
    public void setTaste(String taste){
        this.taste = taste;
    }
    public String getTaste(){
        return taste;
    }
    @Override
    public void giveWater() {
        System.out.println("every 3 weeks");

    }
}
