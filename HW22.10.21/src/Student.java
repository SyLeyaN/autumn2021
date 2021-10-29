public class Student {
    protected String fName;
    protected String sName;
    protected String tName;
    protected int ticket;
    protected String study;

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public String gettName() {
        return tName;
    }

    public int getTicket() {
        return ticket;
    }

    public String getStudy() {
        return study;
    }

    public Student(String fName, String sName, String tName){
        this.fName=fName;
        this.sName=sName;
        this.tName=tName;
    }

    public Student(String fName, String sName, String tName, int ticket, String study){
        this.fName=fName;
        this.sName=sName;
        this.tName=tName;
        this.ticket=ticket;
        this.study=study;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", tName='" + tName + '\'' +
                ", ticket=" + ticket +
                ", study='" + study + '\'' +
                '}';
    }
}
