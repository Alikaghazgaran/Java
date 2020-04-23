public class Employee extends Person {
    public String office;
    public int salary;
    public void dateHired() {
        System.out.println(java.time.LocalDate.now());
    }
    public String toString() {
        return ("Employee " + name);
    }
}