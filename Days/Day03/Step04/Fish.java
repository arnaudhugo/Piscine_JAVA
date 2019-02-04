public abstract class Fish implements Animal {
    protected String name;

    public Fish() {
    }

    public Fish(String name) {
	this.name = name;
    }

    public String getName() {
	return(this.name);
    }

    public void setName(String name) {
	this.name = name;
    }

    public abstract void say();

    public abstract void swim();
}