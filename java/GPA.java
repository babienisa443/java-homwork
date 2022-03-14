//class
public class GPA {
    private String studentId;
    private double average;
    private double mathGrade, engGrade, thaiGrade;
    private String fCheck;
    public static int defaultGPA = 0;

    // attributes
    GPA() {

    }

    GPA(String studentId, double mathGrade, double engGrade, double thaiGrade, double average, boolean fCheck) {
        this.studentId = studentId;
        this.average = average;
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.thaiGrade = thaiGrade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setThaiGrade(double thaiGrade) {
        this.thaiGrade = thaiGrade;
    }

    public void setEngGrade(double engGrade) {
        this.engGrade = engGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getThaiGrade() {
        return thaiGrade;
    }

    public double getEngGrade() {
        return engGrade;
    }

    public String fCheck() {
        if (average < 50)
            return "f";
        if (average < 55)
            return "d";
        if (average < 60)
            return "d+";
        if (average < 65)
            return "c";
        if (average < 70)
            return "c+";
        if (average < 75)
            return "b";
        if (average < 80)
            return "b+";
        return "a";

    }

    public double getAverage() {
        this.average = (this.mathGrade + this.engGrade + this.thaiGrade) / 3;
        return this.average;
    }

}