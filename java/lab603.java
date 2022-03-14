public class lab603 {
    public class TestStackOfIntegers {
        public static void main(String[] args) {
            Queue q = new Queue();
            for (int i = 0; i < 20; i++) {
                q.enQueue(i + 1);
            }
            System.out.println("Queue is: ");
            int s = 0;
            while (!q.empty()) {
                System.out.print("\t" + q.deQueue());
                s++;
                if (s == 5) {
                    System.out.println("");
                    s = 0;
                }
            }
        }
    }
}
