package Lab03;

public interface ExamConducting {

    void startExam(Exam exam);

    void endExam(Exam exam);

    boolean isClassAvailableForExam(Exam exam);
}
