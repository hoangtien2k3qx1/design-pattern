package Creational.Abstract_Factory.java.author;

public abstract class Author {
    private String name;

    public abstract String getMainCategory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
