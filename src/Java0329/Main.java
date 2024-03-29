package Java0329;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99, Category.ELECTRONICS); //Category.해서 설정한 카테고리를 불러올수 있다.
        System.out.println(product.getCategory()); //마치 문자열인것처럼 출력됨
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
