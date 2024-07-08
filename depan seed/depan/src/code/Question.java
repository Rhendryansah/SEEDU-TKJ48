package code;

public class Question {

    private String pertanyaan;
    private String opsiA;
    private String opsiB;
    private String opsiC;
    private String opsiD;
    private String penjelasan;

    public Question(String pertanyaan, String opsiA, String opsiB, String opsiC, String opsiD, String penjelasan) {
        this.pertanyaan = pertanyaan;
        this.opsiA = opsiA;
        this.opsiB = opsiB;
        this.opsiC = opsiC;
        this.opsiD = opsiD;
        this.penjelasan = penjelasan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getOpsiA() {
        return opsiA;
    }

    public String getOpsiB() {
        return opsiB;
    }

    public String getOpsiC() {
        return opsiC;
    }

    public String getOpsiD() {
        return opsiD;
    }

    public String getPenjelasan() {
        return penjelasan;
    }
}
