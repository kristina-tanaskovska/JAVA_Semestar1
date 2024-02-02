public class Main{
    public static void main(String[] args) {
        Balsamic balsilica = new Balsamic();



        balsilica.setTaste("good");
        System.out.println(balsilica.getTaste());
        balsilica.display("GSD", 33);
        balsilica.giveWater();
    }
}