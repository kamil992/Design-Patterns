package fluentBuilder.simpleBuilder;

public class Main {
    public static void main(String[] args) {

        PersonModel person = new PersonModel.Builder()
                .setFirstname("Someone")
                .setLastname("Builder")
                .setAge(20)
                .setGender("Male")
                .setCountry("Poland")
                .setCity("Warsaw")
                .setPhoneNumber(111235449)
                .build();

        System.out.println(person);
    }
}
