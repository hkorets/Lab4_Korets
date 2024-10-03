package lotr.kickstrategy;

import lotr.Character;

public interface KickStrategy {
    public void kick(Character whoKick, Character whoIsKicked);
}
