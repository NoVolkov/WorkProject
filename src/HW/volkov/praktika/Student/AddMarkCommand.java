package HW.volkov.praktika.Student;

public class AddMarkCommand implements Command {
    Report rep;
    int stIndex;
    int mark;

    public AddMarkCommand(Report rep, int stIndex, int mark) {
        this.rep = rep;
        this.stIndex = stIndex;
        this.mark = mark;
    }

    @Override
    public void execute() {
        if(stIndex<rep.getStudents().size()){
            rep.getStudents().get(stIndex).addMark(mark);
        }
    }

    @Override
    public void cancel() {
        rep.getStudents().get(stIndex).getMarks().remove(stIndex);
    }
}
