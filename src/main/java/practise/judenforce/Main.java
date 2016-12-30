package practise.judenforce;

import practise.judenforce.factory.JudgeStrategyFactory;
import practise.judenforce.strategy.court.JudgeSelectionStrategy;

/**
 * Created by guz_us on 30.12.2016.
 */
public class Main {

    private JudgeStrategyFactory judgeStrategyFactory;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        judgeStrategyFactory = JudgeStrategyFactory.getInstance();
        JudgeSelectionStrategy judgeSelectionStrategy;

        try {

            // ключ, полученный от клиента
            String keyFromClient = "individual";

            // поиск и выбор стратегии
            judgeSelectionStrategy = chooseStrategy(keyFromClient);

            // выполнение алгоритма
            System.out.println(judgeSelectionStrategy.execute());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private JudgeSelectionStrategy chooseStrategy(String key) throws Exception {
        switch (key) {
            case "individual" :
                return getJudStrategy( JudgeStrategyFactory.INDIVIDUAL_STRATEGY_KEY );
            case "jur" :
                return getJudStrategy( JudgeStrategyFactory.JUR_STRATEGY_KEY );
            case "enterpreneur" :
                return getJudStrategy( JudgeStrategyFactory.ENTERPRENEUR_STRATEGY_KEY );
            default:
                throw new Exception("There is no such type of Judge strategy");
        }
    }

    private JudgeSelectionStrategy getJudStrategy(String key) {
        return judgeStrategyFactory.getStrategyByKey(key);
    }
}
