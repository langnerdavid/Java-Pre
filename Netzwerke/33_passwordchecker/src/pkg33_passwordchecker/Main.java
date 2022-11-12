/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg33_passwordchecker;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HTTPHandler mySearch = new HTTPHandler();
        Hash hash = new Hash();
        
        String hashValue = hash.calcSHA1("password");
        String hashValueFirst5 = hashValue.substring(0, 5);
        String hashValueLast35 = hashValue.substring(5, 40);
        System.out.println(hashValue);
        
        try
        {
            String HIBPResults = mySearch.get("https://api.pwnedpasswords.com/range/" + hashValueFirst5);
            if(HIBPResults.contains(hashValueLast35.toUpperCase())) {
                System.out.println("Passwort wurde in der Datenbank gefunden!");
            } else {
                System.out.println("Passwort wurde in der Datenbank NICHT gefunden!");
            }
        }
        catch (Exception e)
        {
            // Exception verarbeiten
            System.out.println(e.getMessage());
        }
        
    }
    
}
