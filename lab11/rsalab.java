import java.math.BigInteger;
import java.util.Random;

public class rsalab {
private BigInteger p; 
private BigInteger q; 
private BigInteger n; 
private BigInteger phi; 
private BigInteger e,d; 
private int bitlength=256;
private Random r; 
long p1;
public rsalab()
{
r=new Random();
p=BigInteger.probablePrime(bitlength, r); 
q=BigInteger.probablePrime(bitlength, r);
n=p.multiply(q); phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)); 
e=BigInteger.probablePrime(bitlength/2, r);
while(phi.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0) {
e.add(BigInteger.ONE); 
}
d=e.modInverse(phi); 
}
public rsalab(BigInteger e,BigInteger d,BigInteger n) {
this.e=e; 
this.d=d; 
this.n=n;
}

public byte[] encrypt(byte[] message) {
return (new BigInteger(message)).modPow(e,n).toByteArray(); 
}

public byte[] decrypt(byte[] message) {
return (new BigInteger(message)).modPow(d,n).toByteArray(); }
}
