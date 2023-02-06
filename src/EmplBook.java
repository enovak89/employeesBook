import java.util.Arrays;

public class EmplBook {
    private Employee[] book;
    private int count;

    public EmplBook(int size) {
        book = new Employee[size];
    }

    public void addEmpl(Employee e) {
        if (count >= book.length) {
            System.out.println("There is no space for new employee");
            return;
        }
        if (e != null) {
            book[count++] = e;
        } else {
            System.out.println("Can not to add null employee");
        }
    }

    public void removeEmpl(Employee e) {
        for (int i = 0; i < book.length - 1; i++) {
            if (book[i].getFio().equals(e.getFio())) {
                System.arraycopy(book, i + 1, book, i, book.length - 1 - i);
                System.out.println("Employee " + e.getFio() + " was removed");
                book[book.length - 1] = null;
                count--;
                Employee.count--;
                return;
            }
        }
    }


    public void printAll() {
        for (Employee e : book) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public int getSalarySumPerMonth() {
        int salarySumPerMonth = 0;
        for (Employee e : book) {
            if (e != null) {
                salarySumPerMonth += e.getSalary();
            }
        }
        return salarySumPerMonth;
    }

    public Employee getMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee emplWithMinSalary = null;
        for (Employee e : book) {
            if (e != null && e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                emplWithMinSalary = e;
            }
        }
        return emplWithMinSalary;
    }

    public Employee getMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee emplWithMaxSalary = null;
        for (Employee e : book) {
            if (e != null && e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                emplWithMaxSalary = e;
            }
        }
        return emplWithMaxSalary;
    }

    public double getAverageSalary() {
        return getSalarySumPerMonth() / count;
    }

    public void printAllFio() {
        for (Employee e : book) {
            if (e != null) {
                System.out.println(e.getFio());
            }
        }
    }

    public void changeSalary(String fio, int newSalary) {
        for (Employee e : book) {
            if (e != null && e.getFio().equals(fio)) {
                e.setSalary(newSalary);
                System.out.println("Salary was changed: " + e);
            }
        }
    }

    public void changeDep(String fio, int newDep) {
        for (Employee e : book) {
            if (e != null && e.getFio().equals(fio)) {
                e.setDepartment(newDep);
                System.out.println("Department was changed: " + e);
            }
        }
    }

    public void printAllEmplSortByDep() {
        for (int i = 1; i <= 5; i++) {
           System.out.println("Department " + i + " employees");
            for (Employee e : book) {
                if (e != null && e.getDepartment() == i) {
                    System.out.println(e);
                }
            }
        }
    }
}
