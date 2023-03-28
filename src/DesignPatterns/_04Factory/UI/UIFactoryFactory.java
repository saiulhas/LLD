package DesignPatterns._04Factory.UI;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch(platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new iosUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
