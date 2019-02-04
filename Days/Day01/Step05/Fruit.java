public class Fruit {
    private String name;
    private int calories;

    public Fruit(String name, int calories) {
	this.name = name;
	this.calories = calories;
    }
    
    public String setName(String name) {
	this.name = name;
	return(this.name);
    }

    public String getName() {
	return(this.name);
    }

    public int setCalories(int calories) {
	this.calories = calories;
	return(this.calories);
    }

    public int getCalories() {
	return(this.calories);
    }

    public String toString() {
	System.out.println("Fruit [name=" + this.name + ", calories=" + this.calories + "]");
	return("Fruit [name=" + this.name + ", calories=" + this.calories + "]");
    }
}