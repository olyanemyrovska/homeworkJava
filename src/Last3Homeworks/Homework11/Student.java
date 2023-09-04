package Last3Homeworks.Homework11;

public class Student {
    private String name;
    private int score;
    private String[] files;

    public String[] getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }

    public Student(String name, String[] files) {
        this.score = 0;
        this.name = name;
        this.files = files;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int checkFileExtension(String fileName)
            throws IncorrectFileException {
        if (fileName != null && !fileName.isEmpty()) {
            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            throw new IncorrectFileException(-1, "File is invalid");
        }
    }
}
