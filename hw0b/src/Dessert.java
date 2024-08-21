public class Dessert {
    int flavor;
    int price;
    static int numDesserts = 0;
    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }
    public void printDessert() {
        //例如，如果我们创建一个口味为 1 且价格为 2 的甜点，
        // 然后调用其 printDessert（） 方法，它应该打印 1 2 1。
        //如果我们然后创建一个口味为 3 和价格为 4 的甜点,
        // 然后调用其 printDessert（） 方法，它应该打印 3 4 2。
        System.out.println( flavor + " " + price + " " + numDesserts );
    }
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
