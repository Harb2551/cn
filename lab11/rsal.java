import java.lang.*;
import java.math.BigInteger; 
import java.util.Random; 
import java.io.*;
public class rsal {
public static void main(String[] args) throws IOException
{
rsalab rsa=new rsalab();

DataInputStream in=new DataInputStream(System.in); String teststring;
System.out.println("Enter the plain text:");
teststring = in.readLine();
bts s1=new bts();
System.out.println("Encrypting string: " +teststring); 
System.out.println("String in bytes:"+s1.bytesToString(teststring.getBytes()));
bts s2=new bts();
byte[] encrypted=rsa.encrypt(teststring.getBytes());
System.out.println("Encrypted string :"+s2.bytesToString(encrypted));
bts s3=new bts();
byte[] decrypted=rsa.decrypt(encrypted);
System.out.println("Decrypted string in bytes :"+s3.bytesToString(decrypted)); 
System.out.println("Decrypted string :" + new String(decrypted));
}}
class bts {
public String bytesToString(byte[] encrypted) {
String test=""; for(byte b:encrypted) {
test+=Byte.toString(b); }
return test;
}
}