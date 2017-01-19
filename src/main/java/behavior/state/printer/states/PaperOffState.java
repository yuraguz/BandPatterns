package behavior.state.printer.states;

import behavior.state.printer.Printer;
import behavior.state.printer.interfaces.IState;

/**
 * Created by Yura on 18.01.2017.
 *
 * Класс, описывающий поведение принтера в состоянии "Отсутствует бумага"
 */
public class PaperOffState implements IState {

    private Printer printer;

    public PaperOffState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void on() {
        System.out.println("Принтер уже включен. Повторное выполнение операции невозможно");
    }

    @Override
    public void off() {
        System.out.println("Принтер выключен");
        printer.setState(Printer.POWER_OFF_STATE);
    }

    @Override
    public void print() {
        System.out.println("Бумаги нет, печать невозможна");
    }

    @Override
    public void addPaper(int count) {
        System.out.println("Бумага добавлена");
        printer.addPaperCount(count);

        if (printer.getCountPaper() > 0) {
            printer.setState(Printer.WAITING_STATE);
        }
    }

    @Override
    public void getStateInfo() {
        System.out.println("Текущее состояние принтера: отсутствует бумага" );
    }

}
