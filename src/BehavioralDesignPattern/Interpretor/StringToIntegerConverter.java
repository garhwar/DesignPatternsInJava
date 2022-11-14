package BehavioralDesignPattern.Interpretor;

public class StringToIntegerConverter implements Pattern {
    @Override
    public int convert(String expression) {
        return Integer.parseInt(expression);
    }
}
