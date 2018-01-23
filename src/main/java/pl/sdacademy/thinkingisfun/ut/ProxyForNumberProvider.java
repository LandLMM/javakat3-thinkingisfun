package pl.sdacademy.thinkingisfun.ut;

public class ProxyForNumberProvider {

    private final NumberProvider numberProvider;

    public ProxyForNumberProvider(NumberProvider numberProvider) {
        this.numberProvider = numberProvider;
    }

    public Integer getInteger() {
        return numberProvider.provideInteger();
    }

    public Long getLong() {
        return numberProvider.provideLong();
    }

    public Float getFloat() {
        return numberProvider.provideFloat();
    }

    public Double getDouble() {
        return numberProvider.provideDouble();
    }

}
