package pokemon;

public class Lavados extends Pokemon implements FireType,FlyingType{
    public Lavados(String name, int hp, int attack) {
        super("Lavados", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        return FireType.super.isWeakAgainst(other)|| FlyingType.super.isWeakAgainst(other);

    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return FireType.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
    }
}
