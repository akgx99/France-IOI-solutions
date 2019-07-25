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
        gauche();
        gauche();
        
        System.out.println("Bonjour, laissez-moi vous aider\n");
        ramasser();
    
        for (int loop = 1; loop <= 32; loop ++) {
            droite();
        }
        deposer();
    }
    
}
