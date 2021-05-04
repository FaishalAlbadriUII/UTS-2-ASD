package uts.soal.pkg2;

/**
 *
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class UTSSoal2 {
    
    private final static String huruf = "HIJKLMNXYZ";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(getLengthString());
        System.out.println(getCharAtIndexString(7));
        System.out.println(getIndexChar());
    }
    
    private static int getLengthString(){
        return huruf.length();
    }
    
    private static char getCharAtIndexString(int index){
        return huruf.charAt(index);
    }
    
    private static int getIndexChar(){
        return huruf.indexOf("Y");
    }
    
}
