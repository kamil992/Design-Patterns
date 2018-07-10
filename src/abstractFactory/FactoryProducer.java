package abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getTranslatorFactory(String languageFactory){

        if(languageFactory.equalsIgnoreCase("POLISH"))
            return new PolishTranslatorFactory();

        if(languageFactory.equalsIgnoreCase("GERMAN"))
            return  new GermanTranslatorFactory();


        return null;
    }
}
