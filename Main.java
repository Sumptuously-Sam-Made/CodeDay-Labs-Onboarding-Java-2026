void main() {
    for (int i = 1; i <= 100; i++) {
        System.out.println(i);
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("fizzbuzz");
            continue;
        }
        if (i % 3 == 0) {
            System.out.println("fizz");
        }
        if (i % 5 == 0) {
            System.out.println("buzz");
        }
    }
}
