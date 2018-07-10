package abstractFactory;

public class GermanTranslatorFactory extends AbstractFactory {
    @Override
    Polish getPolishLanguage() {
        return null;
    }

    @Override
    German getGermanLanguage() {
            return new EnglishGermanTranslator();

    }
}
