package pokemon;

public interface Nameable {
        default String getName(){
            return getClass().getSimpleName();
        };
}
