public class Client {
  public static void main(String[] args) {
    AbstractFactory factory1 = new ConcreteFactory1();
    AbstractProductA productA1 = factory1.createProductA();
    AbstractProductB productB1 = factory1.createProductB();

    AbstractFactory factory2 = new ConcreteFactory2();
    AbstractProductA productA2 = factory2.createProductA();
    AbstractProductB productB2 = factory2.createProductB();

    System.out.println("Product A1: " + productA1.getClass().getName());
    System.out.println("Product B1: " + productB1.getClass().getName());
    System.out.println("Product A2: " + productA2.getClass().getName());
    System.out.println("Product B2: " + productB2.getClass().getName());
  }
}