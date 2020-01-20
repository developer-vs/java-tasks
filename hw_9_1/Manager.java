package hw_9_1;

public class Manager {

    /*
        Необходимо создать класс Manager в который нужно добавить следующие методы:
        getNumberOfSubordinates - получить количество подчиненных
        setNumberOfSubordinates
     */

    private int  numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    /*
        в классе, метод getSalary будет возвращать значение по формуле
         - <базовая ставка> * (<количество подчиненных> / 100 * 3).
         Если количество подчиненных 0, то результат как у обычного рабочего.
     */

}
