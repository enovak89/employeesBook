public class Main {
    public static void main(String[] args) {
        EmplBook companyNameBook = new EmplBook(10);
        companyNameBook.addEmpl(new Employee("A A A", 1, 40_000));
        companyNameBook.addEmpl(new Employee("B B B", 1, 45_000));
        companyNameBook.addEmpl(new Employee("C C C", 2, 25_000));
        companyNameBook.addEmpl(new Employee("D D D", 2, 30_000));
        companyNameBook.addEmpl(new Employee("E E E", 3, 35_000));
        companyNameBook.addEmpl(new Employee("F F F", 3, 55_000));
        companyNameBook.removeEmpl(new Employee("D D D", 5, 0));
        companyNameBook.addEmpl(new Employee("G G G", 4, 50_000));


        companyNameBook.printAll();
    }
}