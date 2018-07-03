package fluentBuilder.simpleBuilder;

public class PersonModel {

    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String country;
    private String city;
    private int phoneNumber;

    private PersonModel(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.country = builder.country;
        this.city = builder.city;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static class Builder{

        private String firstname;
        private String lastname;
        private int age;
        private String gender;
        private String country;
        private String city;
        private int phoneNumber;

        public Builder(){ }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public PersonModel build(){
            return new PersonModel(this);
        }
    }
}
