package pokemon;

public class Arktos extends Pokemon implements IceType,FlyingType{
    public Arktos(String name, int hp, int attack) {
        super("Arktos", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        return IceType.super.isWeakAgainst(other) || FlyingType.super.isWeakAgainst(other);
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return IceType.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
    }
}
