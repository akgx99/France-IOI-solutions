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
        for(int i = 1; i < 16; i++)
        {
            droite();
            ramasser();
        }
        
        droite();
        deposer();
    }
    
}
