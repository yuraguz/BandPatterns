package behavior.state.printer;

import behavior.state.printer.interfaces.IState;
import behavior.state.printer.states.PaperOffState;
import behavior.state.printer.states.PowerOffState;
import behavior.state.printer.states.PrintState;
import behavior.state.printer.states.WaitingState;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yura on 18.01.2017.
 *
 * Класс, описывающий принтер
 * Содержит объект своего состояния IState
 *
 * <p>
 * Принтер умеет следующее:
 *  - включаться
 *  - выключаться
 *  - печатать документ
 *  - пополняться бумагой
 * </p>
 * <p>
 *     В зависимости от текущего состояния принтера,
 *     вышеописанные операции происходят по-разному
 * </p>
 *
 * В данной реализации контекст, меняющий свое состояние,
 * сам содержит ссылки на объекты состояний, что уменьшает
 * гибкость разработки.
 */
public class Printer {

    private IState state; // определяет текущее состояние принтера
    private int countPaper; // текущее количество бумаги

    // хранилище состояний
    Map<String, IState> printerStates;

    // возможные состояния принтера
    public final static String PAPER_OFF_STATE = "paperOffState";
    public final static String POWER_OFF_STATE = "powerOffState";
    public final static String PRINT_STATE = "printState";
    public final static String WAITING_STATE = "waitingState";

    public Printer() {

        // инициализируем возможные состояния
        printerStates = new HashMap<>();
        printerStates.put(PAPER_OFF_STATE, new PaperOffState(this));
        printerStates.put(POWER_OFF_STATE, new PowerOffState(this));
        printerStates.put(PRINT_STATE, new PrintState(this));
        printerStates.put(WAITING_STATE, new WaitingState(this));

        // устанавливаем начальное состояние принтера (выключено)
        state = printerStates.get(POWER_OFF_STATE);

        // изначально бумага отсутствует
        countPaper = 0;

    }

    /**
     * Класс контекста, находящийся в определенном состоянии
     * (в нашем случае это сам принтер) должен иметь метод установки состояния
     *
     * @param state - состояние
     */
    public void setState(IState state) {
        this.state = state;
    }

    /**
     * Печать документа
     */
    public void printDocument() {
        state.print();
    }

    /**
     * Выключение принтера
     */
    public void powerOff() {
        state.off();
    }

    /**
     * Включение принтера
     */
    public void powerOn() {
        state.on();
    }

    /**
     * Добавление бумаги
     * @param count - количество листов бумаги
     */
    public void addPaper(int count) {
        this.state.addPaper(count);
    }

    /**
     * Прибавляет кол-во листов
     */
    public void addPaperCount(int countPaper) {
        this.countPaper += countPaper;
    }

    public void getStateInfo() {
        this.state.getStateInfo();
    }

    /**
     * Получаем состояние по названию
     * @param stateName - название состояния
     */
    public void setState(String stateName) {
        this.state = printerStates.get(stateName);
    }

    public int getCountPaper() {
        return this.countPaper;
    }

}
