package tucan.compiler.model.description;

import java.util.HashMap;
import java.util.Map;

public enum Symbol {
    A('1'),
    C('2'),
    D('3'),
    L('4'),
    R('5'),
    N('6'),
    DELIMITER('7');

    private final static Map<Character, Symbol> map = new HashMap<>();

    static {
        for (Symbol s : Symbol.values()) {
            map.put(s.c, s);
        }
    }

    private final char c;

    Symbol(char c) {
        this.c = c;
    }

    public static Symbol get(char c){
        Symbol symbol = map.get(c);
        if (symbol == null) {
            throw new IllegalArgumentException(String.valueOf(c));
        }
        return symbol;
    }
}
