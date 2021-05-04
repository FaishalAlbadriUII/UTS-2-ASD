package uts.soal.pkg4;

import java.util.Arrays;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class UTSSoal4 {

    public static void main(String[] args) {  
        int[] nim = {2, 0, 5, 2, 3, 1, 6, 6};
        Stack stack = new Stack(nim.length);
        
        System.out.println("Nim Asli : ");
        for(int i = 0; i < nim.length; i++) {
            stack.push(nim[i]);
            System.out.println(nim[i]);
        }
        
        System.out.println("\nNim Setelah Dibalik : ");
        for(int i = 0; i < nim.length; i++) {
            nim[i] = stack.pop();
            System.out.println(nim[i]);
        }
    }   
}
