package Java0329;

public class Product {
    private String name;
    private double price;
    private Category category;  //Category Enum을 주는 순가 설정한 카테고리 정보 외에는 사용할수 없다.
                                //클래스의 일부지만 Enum이다.

    //생성자
    public Product() {
    }

    //일반생성자
    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //겟터셋터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
