package za.co.dvt.grads.solid.principles.openclosed;

public class PizzaRestaurant {

    public Pizza makePizza(String type) {

        Pizza pizza = new Pizza();

        switch (type) {
            case "vegetarian" -> {
                pizza.setArtichokeHeart(new ArtichokeHeart());
                pizza.setMushroom(new Mushroom());
                pizza.setOlive(new Olive());
                pizza.setBellPepper(new BellPepper());
                pizza.setCheese(new Cheese());
                pizza.setOnion(new Onion());
                pizza.setTomato(new Tomato());
            }
            case "funghi" -> {
                pizza.setMushroom(new Mushroom());
                pizza.setCheese(new Cheese());
                pizza.setTomato(new Tomato());
            }
            case "cipolla" -> {
                pizza.setCheese(new Cheese());
                pizza.setOnion(new Onion());
                pizza.setTomato(new Tomato());
            }
            default -> {
                System.out.println("I need to know what type of pizza you want me to bake");
            }
        }
        return pizza;
    }
}
