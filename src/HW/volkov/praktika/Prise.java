package HW.volkov.praktika;

public class Prise {
    private static String[] prises=new String[]{"AAAAAAAAAAAAAAAAAAAAAAAAAA","Hello there.", "Close door."};
    public static String randomPrise(){
        return prises[(int)Math.floor(Math.random()*prises.length)];
    }
}
