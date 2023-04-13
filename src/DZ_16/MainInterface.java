package DZ_16;

public class MainInterface {
    public static void main(String[] args) {
        IPhone iphone1 = new IPhone();
        Android android1 = new Android();

        iphone1.makeCall();
        iphone1.sendSms();
        iphone1.goInWeb();
        iphone1.launchItunes();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        android1.makeCall();
        android1.sendSms();
        android1.goInWeb();
        android1.launchLibreOffice();
    }
}
