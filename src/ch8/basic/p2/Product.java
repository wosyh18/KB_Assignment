package ch8.basic.p2;

public class Product <T>{
    public T kind;
    public String model;

    public T getKind() {
        return kind;
    }

    public String getModel() {
        return model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
