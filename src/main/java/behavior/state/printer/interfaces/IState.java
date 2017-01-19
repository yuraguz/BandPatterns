package behavior.state.printer.interfaces;

/**
 * Created by Yura on 18.01.2017.
 *
 * Действия принтера
 */
public interface IState {

    /**
     * Включиться
     */
    void on();

    /**
     * Выключиться
     */
    void off();

    /**
     * Печатать
     */
    void print();

    /**
     * Пополниться бумагой
     * @param count - количество листов бумаги
     */
    void addPaper(int count);

    void getStateInfo();
}
