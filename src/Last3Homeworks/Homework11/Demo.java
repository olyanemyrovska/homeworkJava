package Last3Homeworks.Homework11;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", new String[]{
                "   ", "", "", "", null, null });

        Student student2 = new Student("Piotr", new String[]{
                "homework.jav", "classworkJava", "classwork.java.", "test.gava", "TEST/JAVA", "java.com" });

        Student student3 = new Student("Mykola", new String[]{
                "homework.java", "classwork.java", "classwork123425345.java", "test.java", "TEST.java",
                "anothertest.java" });

        calculateScore(student1);
        System.out.println("Student's " + student1.getName() + " total score is " + student1.getScore());

        calculateScore(student2);
        System.out.println("Student's " + student2.getName() + " total score is " + student2.getScore());

        calculateScore(student3);
        System.out.println("Student's " + student3.getName() + " total score is " + student3.getScore());
    }

    public static void calculateScore(Student student) {
        String[] files = student.getFiles();
        for (String file : files) {
            try {
                int fileScore = student.checkFileExtension(file);
                student.setScore(student.getScore() + fileScore);
                System.out.println("Current score is" + student.getScore() + " adding new point " + fileScore);
            } catch (IncorrectFileException e) {
                student.setScore(student.getScore() + e.getErrorCode());
                System.out.println("Error for student " + student.getName() + ": " + e.getMessage());
            }
        }
    }
}
