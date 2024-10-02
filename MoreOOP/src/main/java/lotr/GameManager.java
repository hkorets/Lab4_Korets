package lotr;

class GameManager {
    void fight(Character c1, Character c2) {
        System.out.println("Fight!");
        System.out.println(c1.getClass().getSimpleName() + " VS " + c2.getClass().getSimpleName());
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            System.out.println(c1.getClass().getSimpleName() + " attack " + c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " was attacked, remain HP: " + c2.getHp());

            if (c2.getHp() <= 0) {
                System.out.println(c2.getClass().getSimpleName() + " was killed by " + c1.getClass().getSimpleName());
                break;
            }

            System.out.println(c2.getClass().getSimpleName() + " attack " + c1.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName() + " was attacked, remain HP: " + c1.getHp());

            if (c1.getHp() <= 0) {
                System.out.println(c1.getClass().getSimpleName() + " was killed by " + c2.getClass().getSimpleName());
                break;
            }
        }
    }
}