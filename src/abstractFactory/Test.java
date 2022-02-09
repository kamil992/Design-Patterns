package abstractFactory;
//_______________________WORDS TO TRANSLATE_________________________________
/*
* Programming
* Implements
* Class
* Method
* Field
* Access modifier
 */

public class Test {
    public static void main(String[] args) {

//_________________________________POLISH__________________________________________\\
        AbstractFactory polishTranslator =
                FactoryProducer.getTranslatorFactory("polish");

        Polish polish = polishTranslator.getPolishLanguage();
        System.out.println("PL:");
        System.out.println(polish.translateToPolish("Method"));
//___________________________________GERMAN___________________________________________\\
        AbstractFactory germanTranslator =
                FactoryProducer.getTranslatorFactory("german");

        German german = germanTranslator.getGermanLanguage();
        System.out.println("GR: ");
        System.out.println(german.translateToEnglish("Access modifier"));
    }
}
