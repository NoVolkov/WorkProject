package HW.volkov.praktika;

public interface NBuildable{
    public NBuildable setN(String name);
    public NBuildable setS(String surname);
    public NBuildable setP(String patronymic);
    public Name get();
}
