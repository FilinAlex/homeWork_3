public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(260,"BMW","Black",123456);
        Car tesla = new Car(200,"Tesla","Red",654213);

        System.out.println(bmw.equals(tesla));
    }
}
