package pl.sdacademy.thinkingisfun.ut;

public class Calculator {

    /**
     * Dodawanie
     * @param a
     * @param b
     * @return
     */
    public long add(int a, int b) {
        return a + b;
    }

    /**
     * Odejmowanie
     * @param a
     * @param b
     * @return
     */
    public long subtraction(int a, int b) {
        return a - b;
    }

    /**
     * Mnozenie
     * @param a
     * @param b
     * @return
     */
    public long multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dzielenie
     * @param a
     * @param b
     * @return
     */
    public double divide(int a, int b) {
        return a / b;
    }

    /**
     * Reszta z dzielenia
     * @param a
     * @param b
     * @return
     */
    public int mod(int a, int b) {
        return a % b;
    }
}
