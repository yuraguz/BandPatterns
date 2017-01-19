package behavior.state.printer;

/**
 * Демонстрация паттерна "Состояние"
 */
public class App {
    public static void main(String[] args) {
        new App();
    }

    public App() {

        // создаем принтер
        Printer printer = new Printer();
        printer.getStateInfo();
        space();

        // начальное состояние принтера "выключен"
        printer.powerOff();
        printer.printDocument();
        space();

        // включаем принтер (меняем состояние на "ожидание печати")
        printer.powerOn();
        printer.powerOn(); // повторное включение невозможно
        printer.getStateInfo();
        space();

        // после печати, выясняется, что бумаги нет.
        // принтер переходит в состояние "Отсутствует бумага"
        printer.printDocument();
        printer.getStateInfo();
        space();

        // добавляем бумагу. Принтер переходит в состояние "ожидание печати"
        printer.addPaper(1);
        printer.getStateInfo();
        printer.printDocument();
        printer.getStateInfo();
        space();

        // на данном этапе бумага кончается
        // принтер переходит в состояние "отсутствия бумаги"
        printer.printDocument();
        printer.getStateInfo();
        space();

        // выключаем принтер
        printer.powerOff();
        printer.getStateInfo();

    }

    private void space() {
        System.out.println();
    }
}
