package pokemon;

public class Arktos extends Pokemon implements IceType,FlyingType{
    public Arktos(String name, int hp, int attack) {
        super("Arktos", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        // Only weakness of FireType, because the FlyingType weakness (grass) is cancelled out by Fire-Type.
        return IceType.super.isWeakAgainst(other);
        // Or:
        // return other instanceof WaterType;
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return IceType.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
    }
}
