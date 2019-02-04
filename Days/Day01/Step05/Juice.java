public class Juice {
    private Fruit fruit;
    private Sugar sugar;
    private int calories;
    private String name;
    private String type;

    public Juice() {
    }

    public Sugar(String name, String type, int calories) {
	this.name = name;
	this.type = type;
	this.calories = calories;
    }

    public Fruit setFruit(Fruit fruit) {
	this.fruit = fruit;
    }
    
    public Fruit getFruit() {
	return(this.fruit);
    }

    public Sugar setSugar(Sugar sugar) {
	this.sugar = sugar;
    }

    public Sugar getSugar() {
	return(this.sugar);
    }

    public int setCalories(int calories) {
	this.calories = calories;
    }

    public int getCalories() {
	return(this.calories);
    }

    public String setName(String name) {
	this.name = name;
    }

    public String getName() {
	return(this.name);
    }

    public String setType(String type) {
	this.type = type;
    }

    public String getType() {
	return(this.type);
    }
    
    public String toString() {
	System.out.println("Juice [fruit=" + this.fruit + ", sugar=" + this.sugar + ", calories=" + this.calories + ", type=" + this.type + ", name=" + this.name + "]");
    }

    public int countCalories() {
	return(this.calories);
    }
}