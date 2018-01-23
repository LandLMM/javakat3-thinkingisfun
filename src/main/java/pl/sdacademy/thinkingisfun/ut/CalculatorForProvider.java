package pl.sdacademy.thinkingisfun.ut;

public class CalculatorForProvider {

    private final NumberProvider numberProvider;

    public CalculatorForProvider(NumberProvider numberProvider) {
        this.numberProvider = numberProvider;
    }

    public Long add() {
        Integer a = numberProvider.provideInteger();
        Integer b = numberProvider.provideInteger();
        return (long) (a + b);
    }

    public Long subtraction() {
        Integer a = numberProvider.provideInteger();
        Integer b = numberProvider.provideInteger();
        return (long) (a - b);
    }

    public Long multiply() {
        Integer a = numberProvider.provideInteger();
        Integer b = numberProvider.provideInteger();
        return (long) (a * b);
    }

    public Double divide() {
        Integer a = numberProvider.provideInteger();
        Integer b = numberProvider.provideInteger();
        return (double) (a / b);
    }

    public Integer mod() {
        Integer a = numberProvider.provideInteger();
        Integer b = numberProvider.provideInteger();
        return a % b;
    }
}
