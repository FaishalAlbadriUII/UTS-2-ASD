package utss.soal.pkg5;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class HitungIpk {
    
    private String matakuliah, nilai_huruf;
    private int sks;
    private double ipk;

    public HitungIpk(String matakuliah, int sks, String nilai_huruf) {
        this.matakuliah = matakuliah;
        this.sks = sks;
        this.nilai_huruf = nilai_huruf;        
        ipkFormat();
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNilai_huruf() {
        return nilai_huruf;
    }

    public void setNilai_huruf(String nilai_huruf) {
        this.nilai_huruf = nilai_huruf;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return matakuliah + " " + sks + " sks " + "nilai " + nilai_huruf ;
    }

    private void ipkFormat() {
        if (nilai_huruf.equals("A")) {
            this.ipk = 4.00;
        } else if (nilai_huruf.equals("A-")) {
            this.ipk = 3.75;
        } else if (nilai_huruf.equals("A/B")) {
            this.ipk = 3.50;
        } else if (nilai_huruf.equals("B+")) {
            this.ipk = 3.25;
        } else if (nilai_huruf.equals("B")) {
            this.ipk = 3.00;
        } else if (nilai_huruf.equals("B-")) {
            this.ipk = 2.75;
        } else if (nilai_huruf.equals("B/C")) {
            this.ipk = 2.50;
        } else if (nilai_huruf.equals("C+") || nilai_huruf.equals("C")) {
            this.ipk = 2.00;
        } else if (nilai_huruf.equals("C-")) {
            this.ipk = 1.75;
        } else if (nilai_huruf.equals("C/D")) {
            this.ipk = 1.50;
        } else if (nilai_huruf.equals("D+")) {
            this.ipk = 1.25;
        } else if (nilai_huruf.equals("D")) {
            this.ipk = 1.00;
        } else {
            this.ipk = 0.00;
        }
    }
    
    
}
