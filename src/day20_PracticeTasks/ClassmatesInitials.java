package day20_PracticeTasks;

public class ClassmatesInitials {

    public static void main(String[] args) {

        String classmates[] = {"Burak Can", "Yunus Kulcu", "Burak Yılmaz", "Recep Çavuşoğlu", "Tuğba 3912", "Çağlar Smyrna"};

        for (String classmate : classmates) {
            System.out.println(classmate.charAt(0) + "." + classmate.charAt((classmate.indexOf(" ") + 1)));
        }

    }
}


/*

1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */