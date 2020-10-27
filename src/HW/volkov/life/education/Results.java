package HW.volkov.life.education;

public class Results {
    public String subject;
    public String teacher;
    public int mark;
    public Results(String subject, String teacher, int mark){
        this.subject=subject;
        this.teacher=teacher;
        this.mark=mark;
    }

    @Override
    public String toString() {
        return subject+", "+teacher+","+mark;
    }
}
