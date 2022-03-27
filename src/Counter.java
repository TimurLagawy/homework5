public class Counter {

        private int min;
        private int max;
        private int current;

        public Counter(int min_, int max_, int current_) {
            min = min_;
            max = max_;
            current = current_;

            for (int i = 0; i < 10; i++) {

            }

            if (current < min || current > max)
                System.out.println("неверное число");
        }

        public Counter(int min_, int max_) {
            this(min_, max_, min_);
            current = min;
        }

        public Counter() {
            this(0, 9, 0);
        }

        public void inc() {
            current++;
            if (current > max)
                current = min;
            System.out.println(current++);
        }

        public void dec() {
            current--;
            if (current < min)
                current = max;
            System.out.println(current--);
        }

        public int value() {
            return current;
             }
    }

