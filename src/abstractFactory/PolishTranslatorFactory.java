package abstractFactory;

public class PolishTranslatorFactory extends AbstractFactory {
    @Override
    Polish getPolishLanguage() {

            return new PolishEnglishTranslator();

    }

    @Override
    German getGermanLanguage() {
        return null;
    }
}
