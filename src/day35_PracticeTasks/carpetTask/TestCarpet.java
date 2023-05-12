package day35_PracticeTasks.carpetTask;

public class TestCarpet {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3, 2, 8, true);
        System.out.println(carpet1);

        carpet1.setPersian(false);
        carpet1.setLength(8);
        carpet1.setWidth(2.5);
        carpet1.setUnitPrice(16);

        System.out.println(carpet1);

    }
}
