package DZ_16;

public class IPhone implements Smartphones, Ios {

    String sms = "Відправляю СМС з iPhone . . .";
    String call = "Дзвоню з iPhone . . .";
    String web = "Заходжу в інтернет з iPhone . . .";
    String ios = "Запускаю программу iTunes з iPhone . . .";

    public void sendSms() {
        System.out.println(sms);
    }

    public void makeCall() {
        System.out.println(call);
    }

    public void goInWeb() {
        System.out.println(web);
    }

    public void launchItunes() {
        System.out.println(ios);
    }
}
