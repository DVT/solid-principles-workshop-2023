package za.co.dvt.grads.solid.principles.openclosed;

public class Pizza {

    private int gramsOfSalt = 5;

    private int gramsOfSaltFromToppings = 0;

    private ArtichokeHeart artichokeHeart;

    private BellPepper bellPepper;

    private Cheese cheese;

    private Mushroom mushroom;

    private Olive olive;

    private Onion onion;

    private Tomato tomato;

    public int getGramsOfSalt() {
        return gramsOfSalt;
    }

    public void setGramsOfSalt(final int gramsOfSalt) {
        this.gramsOfSalt = gramsOfSalt;
    }

    public int getGramsOfSaltFromToppings() {
        return gramsOfSaltFromToppings;
    }

    public void setGramsOfSaltFromToppings(final int gramsOfSaltFromToppings) {
        this.gramsOfSaltFromToppings = gramsOfSaltFromToppings;
    }

    public ArtichokeHeart getArtichokeHeart() {
        return artichokeHeart;
    }

    public void setArtichokeHeart(final ArtichokeHeart artichokeHeart) {
        this.artichokeHeart = artichokeHeart;
    }

    public BellPepper getBellPepper() {
        return bellPepper;
    }

    public void setBellPepper(final BellPepper bellPepper) {
        this.bellPepper = bellPepper;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(final Cheese cheese) {
        this.cheese = cheese;
    }

    public Mushroom getMushroom() {
        return mushroom;
    }

    public void setMushroom(final Mushroom mushroom) {
        this.mushroom = mushroom;
    }

    public Olive getOlive() {
        return olive;
    }

    public void setOlive(final Olive olive) {
        this.olive = olive;
    }

    public Onion getOnion() {
        return onion;
    }

    public void setOnion(final Onion onion) {
        this.onion = onion;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(final Tomato tomato) {
        this.tomato = tomato;
    }
}
