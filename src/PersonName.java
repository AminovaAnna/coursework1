public class PersonName {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String fullName;


    public PersonName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        fullName = lastName + " " + firstName + " " + middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }
    public String getFullName(){
        return this.fullName;
    }

    @Override
    public String toString (){
        return lastName + " " + firstName + " " + middleName;
    }


}