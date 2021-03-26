package factoryDevices;


public class FactoryDevices {

    public static final String ANDROID = "android";
    public static final String IOS = "ios";
    public static final String WINDOWS_PHONE = "windowsphone";

    public static IDevices make(String typeDevice){
        IDevices device;
        switch (typeDevice){
            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device = new IOS();
                break;
            case WINDOWS_PHONE:
                device= new WindowsPhone();
                break;
            default:
                device = new Android();
                break;
        }
        return  device;
    }
}
