        import java.math.BigInteger;
public class DN1 {
        public static void main(String args[]){
            BigInteger a = new BigInteger("869");
            BigInteger b = new BigInteger("85");

            for(BigInteger i = BigInteger.ZERO; i.compareTo(a) < 0; i = i.add(BigInteger.ONE)){
                b = b.add(b);
            }

            System.out.println(b);
        }
}
