package uts.soal.pkg1;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class UTSSoal1 {

    public static void main(String[] args) {
        
        int[] array = {35, 10, 75, 66, 51};
        
        System.out.println(cariNilaiTerbesarCara1(array));
        System.out.println(cariNilaiTerbesarCara2(array));

    }

    private static int cariNilaiTerbesarCara1(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]){
                    temp = intArray[i];  
                    intArray[i] = intArray[j];  
                    intArray[j] = temp; 
                }
            }
        }
        return intArray[intArray.length - 1];
    }
    
    private static int cariNilaiTerbesarCara2(int[] intArray) {
        int nilaiTerbesar = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > nilaiTerbesar) {
                nilaiTerbesar = intArray[i];
            }
        }
        return nilaiTerbesar;
    }
}
