
package cidadela;

/**
 *
 * @author Victor
 */
public class Cidadela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cddla, cddlb, anos;
        cddla = 5000000;
        cddlb = 7000000;
        anos = 0;
        while (cddla <= cddlb){
            System.out.println("População da cidadela A: "+cddla);
            System.out.println("População da cidadela B: "+cddlb);
            cddla = cddla + 300000;
            cddlb = cddlb + 200000;
            anos++;

        }
        System.out.println("Cidadela A demorou "+anos+
                " anos para ficar maior que a Cidadela B");
        System.out.println("A cidadela A tem "+cddla+" de pessoas");
        System.out.println("A cidadela B tem "+cddlb+" de pessoas");
    }
    
}
