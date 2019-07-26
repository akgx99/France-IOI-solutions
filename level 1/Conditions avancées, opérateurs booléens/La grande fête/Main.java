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
      int debut = input.nextInt();
      int fin = input.nextInt();
      int nb = input.nextInt();
       
      int nbSuspects = 0;
      for (int loop = 1; loop <= nb; loop++)
      {
         int arrive = input.nextInt();
         int depart = input.nextInt();
         if( !( (fin < arrive) || (depart < debut) ) )
         {
            nbSuspects++;
         }
      }
      System.out.println(nbSuspects);
   }
}