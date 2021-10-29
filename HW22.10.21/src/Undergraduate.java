public class Undergraduate extends Student{
    private String studyB;

    public String getStudyB() {
        return studyB;
    }

    public Undergraduate(String fName, String sName, String tName){
        super(fName,sName,tName);
    }

    public Undergraduate(String fName, String sName, String tName, int ticket, String study, String studyB){
        super(fName,sName,tName,ticket,study);
        this.studyB=studyB;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", tName='" + tName + '\'' +
                ", ticket=" + ticket +
                ", study='" + study + '\'' +
                ", studyB='" + studyB + '\'' +
                '}';
    }
}
