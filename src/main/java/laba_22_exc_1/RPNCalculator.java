package laba_22_exc_1;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Stack;

public class RPNCalculator {
    private static HashMap<Character, Integer> priority = new HashMap<>() {{
        put('(', 0);
        put('+', 1);
        put('-', 1);
        put('*', 2);
        put('/', 2);
        put('~', 3);
    }};

    private static String parseNumber(String src, int index) {
        var res = "";

        for (; index < src.length(); index++) {
            var num = src.charAt(index);

            if (Character.isDigit(num))
                res += num;
            else {
                break;
            }
        }

        return res;
    }

    private static String toPolandNotation(String equation) {
        StringBuilder res = new StringBuilder();
        var s = new Stack<Character>();
        for (int i = 0; i < equation.length(); ++i) {
            var curr_sym = equation.charAt(i);

            if (Character.isDigit(curr_sym)) {
                res.append(parseNumber(equation, i)).append(" ");
                i += res.length() - 2;
            } else if (curr_sym == '(') {
                s.push(curr_sym);
            } else if (curr_sym == ')') {
                while (!s.empty() && s.peek() != '(') {
                    res.append(s.pop());
                }
                s.pop();
            } else if (priority.containsKey(curr_sym)) {
                var op = curr_sym;
                if (op == '-' && (i == 0 || (i > 1 && priority.containsKey(equation.charAt(i - 1))))) {
                    op = '~';
                }

                while (!s.empty() && (priority.get(s.peek()) >= priority.get(op))) {
                    res.append(s.pop());
                }
                s.push(op);

            }
        }
        while (!s.empty()) {
            res.append(s.pop());
        }
        return res.toString();
    }

    private static double execute(char operation, double first, double second) {
        switch (operation) {
            case '+' -> {return first + second;}
            case '-' -> {return first - second;}
            case '*' -> {return first * second;}
            case '/' -> {return first / second;}
            default -> {return 0;}
        }
    }

    public static double calculate(String equation) {
        var postfix = toPolandNotation(equation);
        System.out.println(postfix);
        Stack<Double> locals = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            var curr_sym = postfix.charAt(i);

            if (Character.isDigit(curr_sym)) {
                String number = parseNumber(postfix, i);
                i += number.length() - 1;
                locals.push(Double.parseDouble(number));
            }  else if (priority.containsKey(curr_sym)) {
                if (curr_sym == '~') {
                    double last = !locals.empty() ? locals.pop() : 0;

                    locals.push(execute('-', 0, last));
                    continue;
                }

                double second = !locals.empty() ? locals.pop() : 0,
                        first = !locals.empty() ? locals.pop() : 0;

                locals.push(execute(curr_sym, first, second));
            }
        }
        return locals.pop();
    }
}
