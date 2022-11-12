/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg33_passwordchecker;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author davidlangner
 */
public class HTTPHandler {
    
    public String get(String url) throws Exception {

        URL u = new URL(url);
        
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();

        Scanner scanner = new Scanner(conn.getInputStream());
        StringBuilder sb = new StringBuilder();
        
        while(scanner.hasNext()) {
            sb.append(scanner.next());
            sb.append("\n");
        }
        
        String s = sb.toString();
        System.out.println(s);
        return s;
    }
    
}
