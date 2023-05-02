package day11_PracticeTasks;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Chrome",
                result;

        switch (browserName) {

            case "Chrome":
                result = "Chrome is opening";
                break;
            case "Firefox":
                result = "Firefox is opening";
                break;
            case "Opera":
                result = "Opera is coming";
                break;
            case "Safari":
                result = "Safari is opening";
                break;
            case "Edge":
                result = "Edge is opening";
                break;
            default:
                result = browserName + " is not valid";

        }

        System.out.println("result = " + result);


    }
}

/*

write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
        	Do Not use if statement or ternary

 */