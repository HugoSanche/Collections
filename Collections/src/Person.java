public class Person implements Comparable<Person> {
    String firstName;
    String lastNmae;

    public Person(String firstName, String lastNmae) {
        this.firstName = firstName;
        this.lastNmae = lastNmae;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return "Person: "+firstName+" "+lastNmae;
    }
}
