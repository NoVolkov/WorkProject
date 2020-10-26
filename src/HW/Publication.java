package HW;
/*
Comment c1=new Comment("Держите ссылку на то как работают светодиоды.",1,null,null);
        Comment c2=new Comment("Спасибо!",0,null,null);
        Comment c3=new Comment("Thanks!",0,null,null);
        Comment c4=new Comment("Это перевод? Пойду оригинал почитаю",0,null,null);
        Comment c5=new Comment("а где ссылка на оригинал?",0,null,null);
        Comment c6=new Comment("автор, добавь ссылку в начало статьи",3,null,null);
        Comment c7=new Comment("Какую только дичь не писали в журналах 20-30гг пытаясь объяснить работу кристаллического детектора",5,null,null);

        c1.answer=new Comment[]{c2,c3};
        c1.next=c4;
        c4.next=c5;
        c5.next=c6;
        c6.next=c7;
        String[] t=new String[]{"История","IT","электроника"};
        String txt="Дорога к твердотельным переключателям была долгой. Она началась с открытия того, что определенные материалы странно ведут себя в присутствии электричества. В 1874 году Фердинанд Браун опубликовал статью “О прохождении электрических токов через сульфиды металлов”. И все завертелось…";
        Publication p=new Publication(10,"История транзистора",t,txt,c1);
 */
public class Publication {
    final String title;
    String text;
    String[]tags;
    Comment com;
    int rang;
    public Publication(int rang,String title,String[] tags,String text,Comment com){
        this.rang=rang;
        this.title=title;
        this.tags=tags;
        this.text=text;
        this.com=com;
    }
    public String getTitle(){
        return this.title;
    }
    public String toString(){
        String str="("+rang+") "+title+"\nтэги: ";
        for(String s:tags){
            str+=s;
            if(s!=tags[tags.length-1]){
                s+=", ";
            }
        }
        str+="\n"+text+"\n"+"Комментарии:\n"+com;
        return str;
    }
}
