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
        for(int i = 1; i <= 20; i++){
            
            ramasser();
            
            for(int j = 1; j <=14; j++){
               droite();
            }
            
            droite();
            deposer();
            
            for(int k = 1; k <= 15; k++){
               gauche();
            }
        }
    }
    
}
