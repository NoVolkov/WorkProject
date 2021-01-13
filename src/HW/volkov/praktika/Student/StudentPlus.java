package HW.volkov.praktika.Student;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/*public class StudentPlus {
    private String name;
    List<StudentMark> stM;
    public StudentPlus(String n, List<StudentMark> sm){
        name=n;
        stM=sm;
    }

}
class StudentMark implements Mark,Iterable<Integer>{
    private List<DisciplineMark> marks;
    public StudentMark(List<DisciplineMark> dm){
        this.marks=dm;
    }

    public int getMarkAsNumber(){//min
        return marks.stream()
                .mapToInt(x->x.getMarkAsNumber())
                .min()
                .orElse(0);
    }
    public String toString(){
        return "Student` marks:";
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

class ExamMark<T> implements Mark{
    public T mark;
    public Function<T, Integer> funcMap;
    @Override
    public int getMarkAsNumber(){
        return funcMap.apply(mark);
    }
}*/
/*
class DisciplineMark implements Mark,Visitor{
    private ExamMark examMark;
    private List<RegularMark> marks;
    private BiFunction<ExamMark, List<RegularMark>, Integer> funcMap;
    public DisciplineMark(ExamMark exMark, List<RegularMark> regMark, BiFunction<ExamMark, List<RegularMark>, Integer> fMap){
        examMark=exMark;
        marks=regMark;
        funcMap=fMap;
    }
    public int getMarkAsNumber(){
        return funcMap.apply(examMark, marks);
    }
    public void visit()
}
class RegularMark<T> implements Mark{
    public T mark;
    public Function<>
}
interface Visitor{
    public void visit(StudentMark mark);
    public void visit(DisciplineMark mark);
    public void visit(RegularMark mark);
}
fin
class MarksIterator implements Iterator<Integer>{
    private int i=0;
    private Iterator<Integer>presentIterator =disciplineMarks.get(0).iterator();
    public boolean hasNext(){
        return (i<2*disciplineMarks.size()-1)||(presentIterator.hasNext());
    }
    public Integer next(){
        if(i<diciplineMarks.size()){
            return disciplineMarks.get(i++).getMarkToNumber();
        }
        if(!presentIterator.hasNext()){
            presentIterator = disciplineMarks.get(++i-disciplineMarks.size()).iterator();
            return presentIterator.next();
        }
    }
}
*/
