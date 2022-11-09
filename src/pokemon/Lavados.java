package pokemon;

public class Lavados extends Pokemon implements FireType,FlyingType{
    public Lavados(String name, int hp, int attack) {
        super("Lavados", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        // Only weakness of FireType, because the FlyingType weakness (grass) is cancelled out by Fire-Type.
        return FireType.super.isWeakAgainst(other);
        // Or:
        // return other instanceof WaterType;
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return FireType.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
    }
}
