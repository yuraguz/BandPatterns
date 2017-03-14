package behavior.interpreter;

/**
 * Created by guz_us on 16.02.2017.
 */
public class Demo {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Male? " + isMale.interpret("John"));
        System.out.println("Married? " + isMarriedWoman.interpret("Married Julie"));

    }
}
