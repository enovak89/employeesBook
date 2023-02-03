public class Employee {
    private int id;
    private String fio;
    private int department;
    private int salary;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        if (0 <= department && department <= 5) {

            this.department = department;
        } else {
            throw new RuntimeException("Некорректный номер отдела");
        }
        this.salary = salary;
        this.id = id;
        id++;
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
}
