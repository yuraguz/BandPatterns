package behavior.state.printer.states;

import behavior.state.printer.Printer;
import behavior.state.printer.interfaces.IState;

/**
 * Created by Yura on 18.01.2017.
 *
 * Класс, описывающий поведение принтера в состоянии печати документа
 */
public class PrintState implements IState {

    private Printer printer;

    public PrintState(Printer printer) {
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
            System.out.println("Идет печать...");
            printer.addPaperCount(-1);
            printer.setState(Printer.WAITING_STATE);
        } else {
            printer.setState(Printer.PAPER_OFF_STATE);
            printer.printDocument();
        }
    }

    @Override
    public void addPaper(int count) {
        printer.addPaperCount(count);
        System.out.println("Бумага добавлена.");
    }

    @Override
    public void getStateInfo() {
        System.out.println("Текущее состояние принтера: в процессе печати" );
    }

}
