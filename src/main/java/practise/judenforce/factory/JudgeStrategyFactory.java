package practise.judenforce.factory;

import practise.judenforce.strategy.court.JudgeSelectionForEnterpreneur;
import practise.judenforce.strategy.court.JudgeSelectionForIndividual;
import practise.judenforce.strategy.court.JudgeSelectionForJur;
import practise.judenforce.strategy.court.JudgeSelectionStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory (Singleton) для стратегий, определяющих тип суда
 * для физ./юр. лиц и индивидуальных предпринимателей
 *
 * Created by guz_us on 30.12.2016.
 */
public class JudgeStrategyFactory {

    public final static String INDIVIDUAL_STRATEGY_KEY = "individual";
    public final static String JUR_STRATEGY_KEY = "jur";
    public final static String ENTERPRENEUR_STRATEGY_KEY = "enterpreneur";

    private static JudgeStrategyFactory instance;

    // хранилище стратегий
    private Map<String, JudgeSelectionStrategy> strategies = new HashMap<>();

    // конструктор заполняет хранилище стратегий
    private JudgeStrategyFactory() {
        strategies.put( INDIVIDUAL_STRATEGY_KEY, new JudgeSelectionForIndividual() );
        strategies.put( JUR_STRATEGY_KEY, new JudgeSelectionForJur() );
        strategies.put( ENTERPRENEUR_STRATEGY_KEY, new JudgeSelectionForEnterpreneur() );
    }

    // получение стратегии по ключу
    public JudgeSelectionStrategy getStrategyByKey(String key) {
        return strategies.get(key);
    }

    public static JudgeStrategyFactory getInstance() {
        if (instance == null) {
            setInstance();
        }
        return instance;
    }

    // инициализация фабрики
    private static synchronized void setInstance() {
        instance = new JudgeStrategyFactory();
    }
}
