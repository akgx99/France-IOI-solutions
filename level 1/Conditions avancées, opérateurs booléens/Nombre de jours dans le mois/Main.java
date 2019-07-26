import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
class Main
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int mois = input.nextInt();
      int res = 0;

      if(mois == 10)
         res = 31;
      else{
         if(mois == 11)
            res = 29;
         else{
            if(mois >= 4 && mois <= 6)
               res = 31;
            else
               res = 30;
         }
      }
      
      System.out.println(res);
   }
}
