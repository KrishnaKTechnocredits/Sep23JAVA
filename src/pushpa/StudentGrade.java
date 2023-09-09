package pushpa;

class StudentGrade {

    public void printGrade(int score) {
        if (score >= 90 && score <= 100)
            System.out.println("A+");
        else if (score >= 80 && score < 90)
            System.out.println("A");
        else if (score >= 70 && score < 80)
            System.out.println("B");
        else if (score >= 0 && score < 70)
            System.out.println("Work harder.");
        else
            System.out.println("Invalide score.");
    }

    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.printGrade(92);
        studentGrade.printGrade(76);
        studentGrade.printGrade(23);
        studentGrade.printGrade(-19);
        studentGrade.printGrade(102);
    }
}