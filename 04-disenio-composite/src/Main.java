//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductSingle hamburger = new ProductSingle("Hamburguesa", 5.0);
        ProductSingle fries = new ProductSingle("fries", 2.0);
        ProductSingle cola = new ProductSingle("cola", 1.0);

        BurgerJoint burgerJoint = new BurgerJoint();
        burgerJoint.addProduct(hamburger);
        burgerJoint.addProduct(fries);
        burgerJoint.addProduct(cola);

        ProductComposite productComposite = new ProductComposite("Combo 1", 0.1);
        productComposite.addProduct(hamburger);
        productComposite.addProduct(fries);
        productComposite.addProduct(cola);

        burgerJoint.addProduct(productComposite);

        ProductComposite mega = new ProductComposite("Mega", 0.25);
        mega.addProduct(productComposite);
        mega.addProduct(fries);
        burgerJoint.addProduct(mega);

        System.out.println(burgerJoint.calculateCartPrice());
    }
}