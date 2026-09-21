public class StudentTester {
    public static void main(String[] args) {
        Student Destin = new Student("Destin");
        Student Theiss = new Student("Theiss", 89);
        Student Liam = new Student ("Liam");
        Student Erin = new Student ("Erin");
        System.out.println("Printing all student data");
        System.out.println("=== 2. PRINTING STUDENTS (toString) ===");
        System.out.println("Student 1 (Default): " + Destin.toString());
        System.out.println("Student 2:           " + Theiss.toString());
        System.out.println("Student 3:           " + Liam.toString());
        System.out.println("Student 4:           " + Erin.toString());
        System.out.println("Setting new Grade and Name");
        Destin.setName("Destino");
        Theiss.setGrade(5);
        System.out.println("Comparing Destin and Theiss");
        boolean equals = Destin.equals(Theiss);
        System.out.println(equals);
        System.out.println("Comparing Destin and Destin");
        boolean same = Destin.equals(Destin);
        System.out.println(same);
    }
}
