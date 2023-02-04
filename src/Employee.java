import java.util.Objects;

public class Employee {
    private final int id;
    private final String fio;
    private int department;
    private int salary;
    static int count = 1;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        if (0 < department && department <= 5) {
            this.department = department;
        } else {
            throw new RuntimeException("Некорректный номер отдела");
        }
        this.salary = salary;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId() + " " + getFio() + " " + getDepartment() + " " + getSalary();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Employee e2 = (Employee) other;
        return fio.equals(e2.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, department, salary);
    }
}
