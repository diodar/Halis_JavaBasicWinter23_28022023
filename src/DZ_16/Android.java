package DZ_16;

public class Android implements Smartphones, LinuxOS {

    String sms = "Відправляю СМС з Android . . .";
    String call = "Дзвоню з Android . . .";
    String web = "Заходжу в інтернет з Android . . .";
    String linux = "Запускаю программу LibreOffice з Android . . .";

    public void sendSms() {
        System.out.println(sms);
    }

    public void makeCall() {
        System.out.println(call);
    }

    public void goInWeb() {
        System.out.println(web);
    }

    public void launchLibreOffice() {
        System.out.println(linux);
    }
}
