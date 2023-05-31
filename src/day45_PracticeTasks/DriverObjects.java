package day45_PracticeTasks;

public class DriverObjects {

    public static void main(String[] args) {

        System.out.println("--------Chrome Tests-------------");
        ChromeDriver chrome = new ChromeDriver();
        chrome.findElement("element");
        chrome.findElements("elements");
        chrome.get("https://www.cydeo.com");
        chrome.close();
        chrome.quit();
        chrome.getTitle();
        chrome.takeScreenShot();
        chrome.executeScript("go");

        System.out.println("--------FireFox Tests-------------");
        FireFoxDriver fireFox = new FireFoxDriver();
        fireFox.findElement("element");
        fireFox.findElements("elements");
        fireFox.get("https://www.cydeo.com");
        fireFox.close();
        fireFox.quit();
        fireFox.getTitle();
        fireFox.takeScreenShot();
        fireFox.executeScript("go");


    }
}
