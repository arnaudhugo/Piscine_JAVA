public class User {
    private String username;
    private String email;
    private int age;
    private boolean active;

    public String getUsername() {
	return(this.username);
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getEmail() {
	return(this.email);
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getAge() {
	return(this.age);
    }

    public void setAge(int age) {
	this.age = age;
    }

    public Boolean isActive() {
	return(this.active);
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    public static class UserBuilder {
	private String username;
	private String email;
	private int age;
	private boolean active;

	public UserBuilder(String username) {
	    this.username = username;
	}

        public UserBuilder setEmail(String email) {
            this.email = email;
            return(this);
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return(this);
        }

        public UserBuilder setActive(boolean active) {
            this.active = active;
            return(this);
        }

	public User build() {
	    return(new User(this));
	}
    }

    private User(UserBuilder u) {
	this.username = u.username;
	this.email = u.email;
	this.age = u.age;
	this.active = u.active;
    }
}