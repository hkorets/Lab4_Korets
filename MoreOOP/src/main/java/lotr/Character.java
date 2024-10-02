package lotr;
import lotr.kickstrategy.KickStrategy;
import lombok.Getter;
import lombok.AllArgsConstructor;


@Getter
// @Setter
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public abstract void kick(Character whoIsKicked);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}