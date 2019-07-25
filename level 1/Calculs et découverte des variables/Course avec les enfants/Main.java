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
      int nbRamasse;
            
      for(int i = 1; i <= 10; i++){
         nbRamasse = i;
         for(int j = 1; j <= nbRamasse; j++){
             droite();
         }
         ramasser();
         for(int k = 1; k <= nbRamasse; k++){
             gauche();
         }
         deposer();
      }
    }
}
