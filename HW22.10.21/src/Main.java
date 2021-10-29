public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Ivanovich", "Ivanov");
        Student s2 = new Student("Peter", "Petrovich", "Petrov", 123456,"study 0");
        Undergraduate u1 = new Undergraduate("Oleg", "Olegovich", "Olegov");
        Undergraduate u2 = new Undergraduate("Makar", "Makarovich", "makarov", 1234567, "study 1",
                "srudy 1203");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(u1.toString());
        System.out.println(u2.toString());

    }
}
