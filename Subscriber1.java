public class Subscriber1 implements Observer {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((HeadQuater) o).getResult());
    }
}
