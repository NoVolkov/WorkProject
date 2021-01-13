package HW.volkov.praktika.Student;

import java.util.*;

public class Report {
    private List<Student> students=new ArrayList<>();
    //private List<Command> commandList =new ArrayList<>();
    private Deque<Command> commands=new ArrayDeque<>();
    private Deque<Command>undoDeque=new LinkedList<>();
    private Deque<Command>redoDeque=new LinkedList<>();
        public Report(Student...s){
            for(Student t:s){
                addStudent(t);
            }

        }
    public void addStudent(Student s){
        students.add(s);
    }
    public void addMark(int index, int mark){
            Command com=new AddMarkCommand(this,index,mark);
            com.execute();
            commands.push(com);
            redoDeque.clear();
    }
    public void cancelMark(int index){
            Command com=commands.pop();
            if(com==null)return;

            commands.pop().cancel();
    }
    public void undo(){

    }
    public void reDo(){
        //Command com=co
    }

    public void delMark(int s, int n){
        students.get(s).delMark(n);
    }
    public void editMark(int s, int n, int m){
        students.get(s).editMark(n,m);
    }
    public List<Student> getStudents(){
            return students;
    }
    public void print(){
        for(Student s:students){
            String str="";
            str+=s.getName()+s.getMarks().toString();
            System.out.println(str);
        }
    }
    //патерн мементо,хранитель,snapshot
    public List<Student> save(){
      List<Student> r=new ArrayList<>();
        for(Student s:students){
            List<Integer> m=new ArrayList<>();
            for(Integer i:s.getMarks()){
                m.add(i);
            }
            Student s1=new Student(s.getName(),m);
            r.add(s1);
        }
        return r;
    }
    public void restore(List<Student> sv){

    }
}
