package uts.soal.pkg3;

import java.text.DecimalFormat;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class UTSSoal3 {

    public static void main(String[] args) {        
        double[][] koordinat = {{1,1}, {2,0.5}, {3,3}};
        
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, jarakMinimum = 0;
        DecimalFormat df = new DecimalFormat("####0.000");
        
        for (int i = 0; i < koordinat.length; i++) {
            try {
                x1 = koordinat[i][0];
                y1 = koordinat[i][1];
                x2 = koordinat[1 + i][0];
                y2 = koordinat[1 + i][1];
            } catch (Exception e) {
                int position = koordinat.length - i - 1;
                x1 = koordinat[position][0];
                y1 = koordinat[position][1];
                x2 = koordinat[i][0];
                y2 = koordinat[i][1];
            }
            
            double jarak = hitJarak(x1, y1, x2, y2);
            String a = x1 + "," +y1;
            String b = x2 + "," +y2;
            
            System.out.println("Jarak Titik Koordinat " + a + " Ke Titik Koordinat " + b + " adalah " + df.format(jarak));
           
            if (jarakMinimum == 0) {
                jarakMinimum = jarak;
            } else {
                if (jarak < jarakMinimum) {
                    jarakMinimum = jarak;
                }
            }
        }
        
        System.out.println("\nJarak Titik Kordinat Terdekat adalah " + df.format(jarakMinimum));
    }
    
    public static double hitJarak(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
