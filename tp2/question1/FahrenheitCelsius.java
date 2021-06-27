package question1;
import static java.lang.Integer.parseInt; 

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
       System.out.print('\u000C');// to clear the terminal window
        // pour tous les param?tres de la ligne de commande
        for (String x : args) 
        {
            float celsius = FahrenheitCelsius.fahrenheitEnCelsius(parseInt(x));
            System.out.println(x + "\u00B0F -> " +celsius + "\u00B0C"); // ligne,
                                                                        // format
                                                                        // impos?s
        }                                                                                       // format
                                                                                // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        return ((int) (((f - 32) * 5 / 9.F) * 10)) / 10.F; 
    }

}
