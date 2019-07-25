import static algorea.Robot.*;

/**
 *
 * @author thomas (lamford sur France-IOI)
 */
public class Main {
    /**
     * 
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 21; i++){
            haut();
            droite();
         }
         
         for(int j = 1; j <= 21; j++){
            gauche();
            bas();
         };
    }
    
}
