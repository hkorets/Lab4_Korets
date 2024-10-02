package lotr;
import lotr.kickstrategy.KingKnightKick;
import java.util.Random;

public class King extends Character{
    static Random random = new Random();
    public King() {
        super(random.nextInt(11) + 5, random.nextInt(11) + 5, new KingKnightKick());
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
