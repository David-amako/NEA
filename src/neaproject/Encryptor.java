/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neaproject;

/**
 *
 * @author tempa
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;



public class Encryptor {
    
    public String encryptString(String input) throws NoSuchAlgorithmException{
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] messageDigest = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1,messageDigest);
        
        return bigInt.toString(16);
        
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        Encryptor en = new Encryptor();
        String word = "thy";
        
        System.out.println(en.encryptString(word));
    }
    
}
