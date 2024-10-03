package lotr.kickstrategy;
import lotr.Character;
import java.util.Random;

public class KingKnightKick implements KickStrategy{
    protected Random random = new Random();
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int damage = random.nextInt(whoKick.getPower() + 1);
        int newHp = whoIsKicked.getHp() - damage;
        whoIsKicked.setHp(Math.max(newHp, 0));
    }
}
