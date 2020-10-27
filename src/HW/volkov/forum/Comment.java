package HW.volkov.forum;
//--------------
public class Comment {
    String text;
    int rang;
    public Comment next;
    public Comment[]answer;
    int k=0;
    public Comment(String text,int rang,Comment next,Comment[]answer){
        this.text=text;
        this.rang=rang;
        this.next=next;
        this.answer=answer;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<k;i++)s+="---";
        s+="("+rang+"): "+text+"\n";
        if(answer!=null) {
            for (Comment c : answer) {
                c.k += 1;
                for(int j=0;j<k;j++)s+="---";
                s += "(" + c.rang + "): " + c.text + "\n";
            }
        }
        if(next!=null){
            next.k=k+1;
            s+=next;
        }
        return s;
    }
}
