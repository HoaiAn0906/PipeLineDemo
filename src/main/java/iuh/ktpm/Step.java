package iuh.ktpm;

public interface Step<I, O>{
    O execute(I input);

    default <R> Step<I, R> then(Step<O, R> source){
        return input -> source.execute(execute(input));
    }

    static <I> Step<I, I> of(Step<I, I> source){
        return source;
    }
}
