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
        //phase 1
      for(int i = 1; i <= 9; i++){
        droite();
     }
     
     for(int j = 1; j <= 9; j++){
        haut();
     }
     
     //phase 2
     for(int k = 1; k <= 4; k++){
        gauche();
        
        for(int m = 1; m <= 8; m++){
           bas();
        }
        
        gauche();
        
        for(int n = 1; n <= 8; n++){
           haut();
        }
        
     }
     
     //phase 3
     gauche();
     
     for(int o = 1; o <= 9; o++){
        bas();
     }

    }
}
