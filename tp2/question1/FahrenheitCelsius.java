package question1;
import static java.lang.Integer.parseInt; 

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
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
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        return ((int) (((f - 32) * 5 / 9.F) * 10)) / 10.F; 
    }

}
