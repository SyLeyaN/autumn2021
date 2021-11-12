public class Verb {
    private String infinitive = "";
    private String pastSimple = "";
    private String pastParticiple = "";
    private String rusName = "";

    public Verb(String inf, String pS, String pP, String rN){
        this.infinitive=inf;
        this.pastSimple=pS;
        this.pastParticiple=pP;
        this.rusName=rN;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getPastSimple() {
        return pastSimple;
    }

    public void setPastSimple(String pastSimple) {
        this.pastSimple = pastSimple;
    }

    public String getPastParticiple() {
        return pastParticiple;
    }

    public void setPastParticiple(String pastParticiple) {
        this.pastParticiple = pastParticiple;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }
}
