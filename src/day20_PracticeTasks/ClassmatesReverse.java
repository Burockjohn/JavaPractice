package day20_PracticeTasks;

public class ClassmatesReverse {

    public static void main(String[] args) {

        String classmates[] = {"Burak Can", "Yunus Kulcu", "Burak Yılmaz", "Recep Çavuşoğlu", "Tuğba 3912", "Çağlar Smyrna"};


        for (int i = 0; i < classmates.length; i++) {

            String result = "";

            for (int j = classmates[i].length() - 1; j >= 0; j--) {
                char ch = classmates[i].charAt(j);
                result += ch;
            }

            System.out.println(result);
        }


    }
}

/*

2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */