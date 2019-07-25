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
        for(int k = 1; k <= 108; k++){
            
            for(int j =1; j <= 13; j++){
               haut();
            }
            
            for(int j =1; j <= 13; j++){
               droite();
            }
            
            for(int j =1; j <= 13; j++){
               bas();
            }
            
            for(int j =1; j <= 13; j++){
               gauche();
            }
       }
    }
    
}
