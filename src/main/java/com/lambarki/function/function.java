package com.lambarki.function;

import java.util.Objects;

public class function {
    @FunctionalInterface
    public interface Consumer<T> {

        void accept(T t);

        default Consumer<T> andThen(Consumer<T> other) {
            return (T t) -> {
                Objects.requireNonNull(other);
              this.accept(t);
              other.accept(t);
            };
        }
    }
}
