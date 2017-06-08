



public class Main {

    public static void main(String[] args) {

    }

    public int incr(int a){
        a = a + 1;
        return a;
    }

    public int decr(int a){
        a = a - 1;
        return a;
    }

    public void cicle(){
        long f = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            }catch (Exception e){
                System.err.println("If Exception  => " + e);
            }
        }
        long b = System.currentTimeMillis();
        System.out.println("Time of cicle = " + (b - f));
    }


    public boolean booleanTest() {
        return false;
    }

    public static Main getMain(){
        return new Main();
    }

    public int kakJeYaIzabella(TestObject testObject){
        return testObject.getID();
    }


}
