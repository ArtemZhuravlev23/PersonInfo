public class Person {
    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        String info = "Call a citizen " + firstName + " " + lastName +
                " from town " + city + " by number " + phoneNumber + ".";
        return info;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}
