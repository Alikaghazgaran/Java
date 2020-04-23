public class main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "p";
        System.out.println(p.toString());

        Student stu = new Student();
        stu.name = "stu";
        System.out.println(stu.toString());

        Employee e = new Employee();
        e.name = "e";
        System.out.println(e.toString());

        Faculty f = new Faculty();
        f.name = "f";
        System.out.println(f.toString());

        Staff sta = new Staff();
        sta.name = "sta";
        System.out.println(sta.toString());
    }
}