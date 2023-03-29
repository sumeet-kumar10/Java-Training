package factoryDesignPattern;

public class Circle implements Shapes{
    private String type;

    protected Circle() {
        this.type = "Circle created";
    }

    public String getType() {
        return this.type;
    }
        
}
