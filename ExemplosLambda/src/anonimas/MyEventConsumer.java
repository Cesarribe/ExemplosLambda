package anonimas;

public interface MyEventConsumer {

    public void consumer(Object value);

    default void calcular() {

    }
}