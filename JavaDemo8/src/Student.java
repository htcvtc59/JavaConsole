/**
 * Created by Monkey.TNT on 10/24/2016.
 */
public class Student {
    public Stringmain name;

    public Student(Stringmain name) {
        this.name = name;
    }

    public Student(String ronaldo) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
