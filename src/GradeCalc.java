public class GradeCalc {

    public static String getGrade(double percent) {
        String grade =" ";
        if (percent < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative");
        }

        if (percent < 40) {
            grade = "F";
        } else if (percent < 50) {
            grade = "D";
        } else if (percent < 60) {
            grade = "C";
        } else if (percent < 70) {
            grade = "B";
        } else if (percent < 80) {
            grade = "A";
        } else if (percent < 90) {
            grade = "A+";
        } else {
            grade = "O";
        }
        System.out.println("Grade: " + grade);
        return grade;
    }
}