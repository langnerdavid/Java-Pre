/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg33_passwordchecker;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author davidlangner
 */
public class Hash {
    public String calcSHA1(String s) {
        
        String sha1 = "";
		
	try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(s.getBytes("utf8"));
            sha1 = String.format("%40x", new BigInteger(1, digest.digest()));
	} catch (Exception e){
            e.printStackTrace();
        }
        return sha1;
    }
}
