public class While {

    public static void main(String[] args) {
        int x = 10;
        while (x > 0) {
            x--;
            System.out.print("x:" + x);
            System.out.println("\n");
        }
        While while1 = new While();
        while1.otherWihile();
        while1.forItem();
    }

    public void otherWihile() {
        int x = 0;
        do {
            x++;
            System.out.print("x:" + x);
            System.out.println("\n");
        } while (x == 0);
    }

    public void forItem() {
        for (int i = 0; i < 10; i++) {
            System.out.print("i:" + i);
            System.out.println("\n");
        }
    }
}
