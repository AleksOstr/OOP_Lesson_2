import Interfaces.Runable;
import Interfaces.Speakable;

public class Animal {
    String nickname;
    int legs;
    String owner;

    public String getNickname() {
        return nickname;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String name, int legs, String owner) {
        this.nickname = name;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s Nickname: %s Owner: %s Legs: %d",
                            this.getClass(), this.getNickname(), this.getOwner(), this.getLegs());
    }
}
