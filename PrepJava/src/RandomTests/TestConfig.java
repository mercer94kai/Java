package RandomTests;

public class TestConfig {


    public static void main(String[] args) {

        configRead config=new configRead();

        System.out.println(config.readProperty());
        System.out.println(config.getPasswd());
    }
}
