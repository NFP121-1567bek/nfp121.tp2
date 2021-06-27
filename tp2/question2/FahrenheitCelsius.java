package question2;
import static java.lang.Integer.parseInt;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return ((int) (((f - 32) * 5 / 9.F) * 10)) / 10.F;
     }

}
