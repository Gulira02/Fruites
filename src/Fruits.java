public class Fruits {
  private   String name;
  private String taste; //вкус
    private String fruitVarieties; //сорта фруктов

    public Fruits(String name, String taste, String fruitVarieties) {
        this.name = name;
        this.taste = taste;
        this.fruitVarieties = fruitVarieties;
    }

    public Fruits() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getFruitVarieties() {
        return fruitVarieties;
    }

    public void setFruitVarieties(String fruitVarieties) {
        this.fruitVarieties = fruitVarieties;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", fruitVarieties='" + fruitVarieties + '\'' +
                '}';
    }
}
