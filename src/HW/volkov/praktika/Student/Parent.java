package HW.volkov.praktika.Student;

public class Parent implements Observer{
    public void notIfy(int t){
        switch (t){
            case 2:
                System.out.println("Плохо");
                break;
            case 3:
                System.out.println("Ну хоть не двойка");
                break;
            case 4:
                System.out.println("Молодец");
                break;
            case 5:
                System.out.println("Отлично");
                break;
        }
    }

}
