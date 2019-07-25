import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
public class Main {
   static Scanner input = new Scanner(System.in);
   /**
     * 
     */
    public static void main(String[] args) {
      int hauteur = input.nextInt();
      int nb = input.nextInt();
      String out = " ";
      
      if(hauteur < 10){
         if(hauteur <= 5 && nb >= 8)
            out ="Tinuviel";
         else{
            if(hauteur <= 8 && nb <= 5)
               out = "Falarion";
         }
      }
      else{
        
         if(hauteur >= 10 && nb >= 10)
            out = "Calaelen";
         else{
            if(hauteur >= 12 && nb <= 7)
               out = "Dorthonion";
         }   
      }
      System.out.println(out);
    }
}
