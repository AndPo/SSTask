import java.util.Comparator;

/**
 * Created by ПК on 14.09.2016.
 */

abstract public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private float salary;

    Employee() {
    }// мусим створювати конструктор без параметрів руцями, бо сам він не створиться(т.я. вже є з параметрами)
    // і при наслідуванні компілятор не пропустись без нього

    Employee(String name, String surname, int id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    protected void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    int getId() {
        return id;
    }

    float getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee d){ // перевантажуєм метод таким чином, щоб при однакових зарплатак двох працівників порівнював їх імена
        if(this.getSalary() > d.getSalary())
            return -1;
        if(this.getSalary() == d.getSalary())
            return (this.getName()).compareTo(d.getName());
        return 1;
    }

        @Override
        public String toString() { // перевантажуєм тустрінг, щоб при його виклику він повертав значення всіх полів(крім зарплати), а не хешкод
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) { // перевантажуєм, щоб можна було сортувати
            if (this == o) return true;
            if (!(o instanceof Employee)) return false;

            Employee employee = (Employee) o;

            if (getId() != employee.getId())
                return false;
            if (!getName().equals(employee.getName()))
                return false;

            return getSurname().equals(employee.getSurname());

        }

        @Override
        public int hashCode() {
            int result = getId();
            result = 31 * result + getName().hashCode();
            result = 31 * result + getSurname().hashCode();
            return result;
        }

}
