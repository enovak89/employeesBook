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


        public void printAll () {
            for (Employee e : book) {
                if (e != null) {
                    System.out.println(e);
                }
            }
        }

}
