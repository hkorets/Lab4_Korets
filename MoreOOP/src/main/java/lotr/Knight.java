package lotr;
import lotr.kickstrategy.KingKnightKick;
import java.util.Random;

public class Knight extends Character{
    static Random random = new Random();
    public Knight() {
        super(random.nextInt(11) + 2, random.nextInt(11) + 2, new KingKnightKick());
    }
    @Override
    public void kick(Character whoIsKicked) {
        getKickStrategy().kick(this, whoIsKicked);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
