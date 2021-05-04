package utss.soal.pkg5;

import java.text.DecimalFormat;
import java.util.LinkedList;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class UTSSSoal5 {

    private static LinkedList<HitungIpk> hitungIpks = new LinkedList<>();
    private static DecimalFormat df = new DecimalFormat("####0.00");
    
    public static void main(String[] args) {
        
        double totalNilai = 0, rataRataNilai = 0;
        int totalSKS = 0;

        tambahData();
        
        System.out.println("Mata Kuliah Diambil: ");
        for (int i = 0; i < hitungIpks.toArray().length; i++) {
            HitungIpk data = hitungIpks.get(i);
            totalSKS = totalSKS + data.getSks();
            totalNilai = totalNilai + (data.getIpk() * data.getSks());
            System.out.println(data.toString());
        }
        
        rataRataNilai = totalNilai / totalSKS;
        
        System.out.println("\nIPK: " + df.format(rataRataNilai));
    }

    private static void tambahData() {
        hitungIpks.add(new HitungIpk("ASD", 5, "A"));
        hitungIpks.add(new HitungIpk("RPL", 6, "A-"));
        hitungIpks.add(new HitungIpk("FPA", 6, "B+"));
        hitungIpks.add(new HitungIpk("PBA", 6, "A"));
        hitungIpks.add(new HitungIpk("SCPK", 3, "C"));
    }
}
