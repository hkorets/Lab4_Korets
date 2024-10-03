package lotr;
import lotr.kickstrategy.ElfKick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKick());
    }

    @Override
    public void kick(Character whoIsKicked) {
        getKickStrategy().kick(this, whoIsKicked);
    }

    public String toString() {
        return super.toString();
    }
}