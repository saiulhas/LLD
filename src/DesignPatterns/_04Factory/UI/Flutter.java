package DesignPatterns._04Factory.UI;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting theme");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }
}
