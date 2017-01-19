package behavior.state.printer.states;

import behavior.state.printer.Printer;
import behavior.state.printer.interfaces.IState;

/**
 * Created by Yura on 18.01.2017.
 *
 * Класс, описывающий поведение принтера в состоянии ожидания печати
 */
public class WaitingState implements IState {

    private Printer printer;

    public WaitingState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void on() {
        System.out.println("Принтер уже включен. Повторное выполнение операции невозможно.");
    }

    @Override
    public void off() {
        System.out.println("Принтер выключен");
        printer.setState(Printer.POWER_OFF_STATE);
    }

    @Override
    public void print() {
        if (printer.getCountPaper() > 0) {
            System.out.println("Происходит печать");
            printer.addPaperCount(-1);
        } else {
            printer.setState(Printer.PAPER_OFF_STATE);
            printer.printDocument();
        }
    }

    @Override
    public void addPaper(int count) {
        System.out.println("Бумага добавлена");
    }

    @Override
    public void getStateInfo() {
        System.out.println("Текущее состояние принтера: в ожидании печати" );
    }
}
