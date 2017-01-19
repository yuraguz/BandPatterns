package behavior.state.printer.states;

import behavior.state.printer.Printer;
import behavior.state.printer.interfaces.IState;

/**
 * Created by Yura on 18.01.2017.
 *
 * Класс, описывающий поведение принтера в выключенном состоянии
 */
public class PowerOffState implements IState {

    private Printer printer;

    public PowerOffState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void on() {
        System.out.println("Принтер включен");
        printer.setState(Printer.WAITING_STATE);
    }

    @Override
    public void off() {
        System.out.println("Принтер уже выключен. Повторное выполнение операции невозможно");
    }

    @Override
    public void print() {
        System.out.println("Принтер отключен. Печать невозможна.");
    }

    @Override
    public void addPaper(int count) {
        printer.addPaperCount(count);
        System.out.println("Бумага добавлена");
    }

    @Override
    public void getStateInfo() {
        System.out.println("Текущее состояние принтера: принтер выключен" );
    }
}
