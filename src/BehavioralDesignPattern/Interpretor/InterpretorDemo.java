package BehavioralDesignPattern.Interpretor;

public class InterpretorDemo {

    public static void main (String[] args)
    {
        Pattern stringToIntConverter = new StringToIntegerConverter();
        int result = stringToIntConverter.convert("1234");
        System.out.println(result);
    }
}
