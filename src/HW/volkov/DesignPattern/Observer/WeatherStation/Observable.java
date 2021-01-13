package HW.volkov.DesignPattern.Observer.WeatherStation;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
