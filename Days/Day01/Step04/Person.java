public class Person {
    private String name;
    private String fullName;
    private int age;
    private float money;
    
    public Person() {
    }

    public Person(String name, String fullName, int age, float money) {
	this.name = name;
	this.fullName = fullName;
	this.age = age;
	this.money = money;
    }
    
    public void setAge(int age) {
	this.age = age;
    }

    public int getAge() {
	return(this.age);
    }

    public String setName(String name) {
	this.name = name;
	return(this.name);
    }

    public String getName() {
	return(this.name);
    }

    public String setFullName(String fullName) {
	this.fullName = fullName;
	return(this.fullName);
    }

    public String getFullName() {
	return(this.fullName);
    }

    public float getMoney() {
	return(this.money);
    }

    public float setMoney(float money) {
	this.money = money;
	return(this.money);
    }
    
    public void addMoney(float money) {
	this.money = this.money + money;
    }

    public void removeMoney(float money) {
	if (this.money > money)
	    this.money = this.money - money;
	else
	    System.out.println("ERROR");
    }
}