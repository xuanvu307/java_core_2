package ex2;

public class Student {
    private static int id = 1;
    private int idStudent;
    private String fullName;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double avgScore;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent() {
        this.idStudent = id++;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return String.format("student : id = %3d , fullName = \"%5s \", avgScore = %.2f " ,idStudent,fullName,avgScore);
    }
}
