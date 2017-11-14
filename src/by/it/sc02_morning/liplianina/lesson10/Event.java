package by.it.sc02_morning.liplianina.lesson10;
/*
вспомогательный класс.
событие у аудитории(два поля: начало и конец)

Обратите внимание на метод compareTo
*/
class Event implements Comparable<Event>{
    private int start;
    private int stop;

    Event(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public int getStart() {
        return this.start;
    }
    public int getStop() { return this.stop; }
    @Override
    public String toString() {
        return "(" + start + ":" + stop + ")";
    }


    @Override
    public int compareTo(Event otherEvent) {
        //сортировка по умолчанию не работает.
        //переопределите возвращаемое значение
        //используя this и otherEvent
        if (this.stop < otherEvent.stop) return 1;
        else if (this.stop == otherEvent.stop) return 0;
        else return -1;
        //подсказка, правильно написанный компаратор возвращает
        //1 если порядок следования в массиве или коллекции this и otherEvent правильный
        //0 если объекты равны
        //-1 если порядок следования в массиве  или коллекции this и otherEvent неправильный
    }
}
