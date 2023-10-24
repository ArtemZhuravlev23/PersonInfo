public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return String.format("Calling citizen %s %s from %s at %s", firstName, lastName, city, phoneNumber);
    }

    public static void main(String[] args) {
        Person will = new Person("Will", "Smith", "New York", "2936729462846");
        Person jackie = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person sherlock = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(will.personInfo());
        System.out.println(jackie.personInfo());
        System.out.println(sherlock.personInfo());
    }
}
