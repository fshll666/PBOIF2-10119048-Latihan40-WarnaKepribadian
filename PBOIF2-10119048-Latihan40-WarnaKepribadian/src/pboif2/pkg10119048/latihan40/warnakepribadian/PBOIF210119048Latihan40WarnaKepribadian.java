/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan40.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Warna kepribadian.
 */
public class PBOIF210119048Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Warna warna = new Warna();
        User user = new User();
        
        System.out.printf("%sYUK %sCEK %sKEPRIBADIANMU %sDARI " +
                "%sWARNA %sFAVORITMU\n\n", warna.RED, warna.GREEN,
                warna.YELLOW, warna.CYAN, warna.MAGENTA, warna.BLUE
        );
        
        System.out.printf("%s\tMERAH\t\t%n", (Warna.BG_RED + Warna.WHITE));
        System.out.printf("%s\tHIJAU\t\t%n", (Warna.BG_GREEN + Warna.WHITE));
        System.out.printf("%s\tKUNING\t\t%n", (Warna.BG_YELLOW + Warna.WHITE));
        System.out.printf("%s\tBIRU\t\t%n", (Warna.BG_BLUE + Warna.WHITE));
        System.out.printf("%s\tUNGU\t\t%n", (Warna.BG_MAGENTA + Warna.WHITE));
        
        System.out.print(Warna.RESET + "\nPILIH WARNA FAVORITMU : ");
        user.setWarna(scanner.next().toUpperCase());
        System.out.print("NAMA KAMU : ");
        user.setNama(scanner.next().toUpperCase());
        
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + user.getNama() + "===");
        warna.tampilKepribadian(user.getWarna());
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }   
    
}
