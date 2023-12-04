import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    int age;
    double gpa;

    // Costruttore
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
}

public class StudentMap {
    Map<String, Student> studentData;

    // metodo che contiente il map Object chiamato 'studentData'
    public StudentMap() {
        studentData = new HashMap<>();
    }

    // Metodo per aggiungere uno studente
    public void addStudent(String key, Student student) {
        studentData.put(key, student);
    }

    // Metodo per rimuovere uno studente
    public void removeStudent(String key) {
        studentData.remove(key);
    }

    // Metodo per ottenere uno studente dalla key
    public Student getStudent(String key) {
        return studentData.get(key);
    }

    // Metodo per calcolare la media GPA di tutti gli oggetti Student nello 'studentData' map.
    public double getAverageGPA() {
        if (studentData.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (Student student : studentData.values()) {
            totalGPA += student.gpa;
        }

        return totalGPA / studentData.size();
    }

    public static void main(String[] args) {

        // Dati di Esempio
        StudentMap studentMap = new StudentMap();

        Student student1 = new Student("John", 28, 2.5);
        Student student2 = new Student("Jane", 22, 6.0);

        studentMap.addStudent("ID1", student1);
        studentMap.addStudent("ID2", student2);

        System.out.println("Average GPA: " + studentMap.getAverageGPA());
    }
}