package day36_PracticeTasks.phoneTask;

public class Test {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("iphone 12", "5,6 inch", "Black", 1000);
        iphone.faceTime(12345678);

        Samsung samsung = new Samsung();
        samsung.setInfo("galaxy S19", "6 inches", "White", 900);
        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik", "4 inches", "Pink", 60);
        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}

/*

1.5 Create a class named Phone Objects and test of the sub class' objects

 */