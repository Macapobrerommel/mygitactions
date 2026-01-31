package your.package.name;

/**
 * Product interface.
 */
interface Product {

    /**
     * Displays product information.
     */
    void display();
}

/**
 * Concrete Product A.
 */
class ConcreteProductA implements Product {

    @Override
    public void display() {
        System.out.println("This is Concrete Product A.");
    }
}

/**
 * Concrete Product B.
 */
class ConcreteProductB implements Product {

    @Override
    public void display() {
        System.out.println("This is Concrete Product B.");
    }
}

/**
 * Factory interface.
 */
interface Factory {

    /**
     * Creates a product.
     *
     * @return a new Product instance
     */
    Product factoryMethod();
}

/**
 * Concrete Factory A.
 */
class ConcreteFactoryA implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

/**
 * Concrete Factory B.
 */
class ConcreteFactoryB implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

/**
 * Client code demonstrating the Factory Method pattern.
 */
public class FactoryMethodExample {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        final Factory factoryA = new ConcreteFactoryA();
        final Product productA = factoryA.factoryMethod();
        productA.display();

        final Factory factoryB = new ConcreteFactoryB();
        final Product productB = factoryB.factoryMethod();
        productB.display();
    }
}
