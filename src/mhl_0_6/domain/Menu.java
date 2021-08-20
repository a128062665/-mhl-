package mhl_0_6.domain;

//javabean表，跟menu表对应
public class Menu {

    private Integer id ;
    private String name;
    private String type;
    private int price;

    public Menu() {
    }

    public Menu(Integer id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "\t\t" + name + "\t\t" + type + "\t\t" + price;
    }
}
