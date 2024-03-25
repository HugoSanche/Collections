package list;


//Collections.sort(Perro) //para que esto funcione debes de implmentar Comparable<Perro>
public class Perro implements Comparable<Perro> {
    private String name;
    private Integer age;

    public Perro(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Perro o) {
        if (this.name.compareTo(o.name)<0){
            return -1;
        }
        if (this.name.compareTo(o.name)==1){
            return 1;
        }
        return 0;
    }
}
