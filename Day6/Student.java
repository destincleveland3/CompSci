public class Student {
    private String name;
    private String id;
    private int grade;
    private int dig123;
    private int dig5678;

    public Student(String newName) {
        name = newName;
        grade = 10;
        id = generateId();
    }
    public Student(String newName, int newGrade) {
        name = newName;
        grade = newGrade;
        id = generateId();
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getId() {
        return id;
    }
    public void setId(String newId) {
        id = newId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }
    public String toString(){
        return ("The students name is " + name + "The students grade is " +
         grade + "The students id is" + id);
    }
    public boolean equals(Student other) {
        if(other.grade == grade && 
            other.id.equals(other.id) &&
            other.name.equals(other.name)
        ) {
            return true;
        }
        return false;
    }
    public String generateId() {
        dig123 = (int)(Math.random() * 800) + 100;
        dig5678 = (int)(Math.random() * 9000) + 1000;
        return dig123 + "-" + dig5678;
    }


}
