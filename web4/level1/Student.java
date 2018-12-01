package level1;

public class Student {
    private int studentNum;
    private String name;
    private int grade;

    public Student() {
    }
    public  Student(String name ,int studentNum,int grade) {
        this.name = name ;
        this.studentNum =studentNum;
        this.grade = grade;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
