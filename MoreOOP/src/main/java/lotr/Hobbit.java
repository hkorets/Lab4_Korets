package lotr;
import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3, new HobbitKick());
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
