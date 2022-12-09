import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Product2Class {
    public static void main(String[] args) {
        ProductClass p1 = new ProductClass("11", "mobile", "electronics", 50000);
        ProductClass p2 = new ProductClass("12", "pen", "plastic", 5);
        ProductClass p3 = new ProductClass("13", "fridge", "electronics", 100);
        ProductClass p4 = new ProductClass("14", "table", " wood", 500);
        ProductClass p5 = new ProductClass("15", " dress", "clothing", 300);
        List<ProductClass> Products= Arrays.asList(p1,p2,p3,p4,p5);
        Stream<ProductClass>product2ClassStream=Products.stream();
       // product2ClassStream.filter(e->e.productCategory=="electronics").forEach(i->System.out.println(i.productName));
        //double sum=product2ClassStream.filter(e->e.productCategory=="electronics").map(x->x.productPrice).reduce((double) 0,(x, y)->x+y);
        //System.out.println(sum);
        //System.out.println(product);
        product2ClassStream.filter(e->e.productCategory=="electronics" && e.productPrice < 500).forEach(i->System.out.println(i.productName));





    }


}
