/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateien;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author davidlangner
 */
public class Dateien {

    /**
     * @param args the command line arguments
     */
    private final String HOME = System.getProperty("user.home");
    private Path datei;

    public static void main(String[] args) {

        Dateien d = new Dateien();
        
        System.out.println("home-Verzeichnis: " + d.HOME);

        d.datei = Paths.get(d.HOME, "Dokumente", "test.txt");
        
        
        d.writeFile();
        d.readFile();
        d.getFileProperties();
        
        d.datei = Paths.get(d.HOME, "Dokumente", "Test");
        d.mkdir(d.datei);
        
        d.rm(d.datei);
    }

    void getFileProperties() {
        System.out.println("Existenztest für datei: " + Files.exists(datei));
        if (Files.exists(datei)) {
            System.out.println("datei ist Verzeichnis: " + Files.isDirectory(datei));
            System.out.println("Reguläre Datei: " + Files.isRegularFile(datei));
            System.out.println("datei ist lesbar: " + Files.isReadable(datei));
            System.out.println("datei ist beschreibbar: " + Files.isWritable(datei));
            try {
                System.out.println("Größe: " + Files.size(datei));
            } catch (IOException e) {
                System.out.println("Dateigröße konnte nicht festgestellt werden!");
            }
        }
    }

    void writeFile() {
        try (BufferedWriter w = Files.newBufferedWriter(datei,
                StandardOpenOption.CREATE)) {
            w.write("Dies ist eine Zeile Text." + "\n");
        } catch (IOException e) {
            System.out.println("Datei konnte nicht geschrieben werden!");
            //e.printStackTrace(System.out);
        }
    }

    void readFile() {
        try (BufferedReader r = Files.newBufferedReader(datei)) {
            String zeile;
            while ((zeile = r.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException e) {
            System.out.println("Datei konnte nicht gelesen werden!");
            //e.printStackTrace(System.out);
        }
    }
    
    void mkdir(Path dir) {
        try {
            Files.createDirectory(dir);
            System.out.println("Verzeichnis " + dir.toString() + " wurde angelegt.");
        } catch (IOException e) {
            System.out.println("Verzeichnis " + dir.toString() + " konnte nicht angelegt werden!");
        }
    }

    void rm(Path dir) {
        try {
            Files.deleteIfExists(dir);
            System.out.println(dir.toString() + " wurde gelöscht.");
        } catch (IOException e) {
            System.out.println(dir.toString() + " konnte nicht gelöscht werden!");
        }
    }

}
