package Hello;

/**
 * 이렇게 작성하면 Java Doc 로 관리된다.
 * VO는 Value Object 의 약어로, DTO (Data Transfer Object)라고 부르기도 한다.
 *
 * @author JiwonDev
 */
public class ProcureItemVO {
    private int id;
    private String name;
    private int quantity;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProcureItemVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
