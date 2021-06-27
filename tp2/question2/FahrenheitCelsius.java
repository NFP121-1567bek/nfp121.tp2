package question2;
import static java.lang.Integer.parseInt;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
   
       
              for (String x : args) {
              
                    try{
                 float celsius = FahrenheitCelsius.fahrenheitEnCelsius(parseInt(x));
                System.out.println(x + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                // format
                System.out.print('\u000C');
                // impos?s
            }
            catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       }
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return ((int) (((f - 32) * 5 / 9.F) * 10)) / 10.F;
     }

}
