package selenium;

import java.time.Duration;

public class MyGoogleTest {
    public static void main(String[] args) {
        String url = "https://www.manager.carteav.com/dashboard_site";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=1920,1080");
        options.setAcceptInsecureCerts(true);
//        options.setHeadless(true);

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manager().timeouts().pageLoadTimeout(Duration.ofMinutes(1));

        driver.get(url);
        driver.close();
        System.out.println("Test End");
    }
}
