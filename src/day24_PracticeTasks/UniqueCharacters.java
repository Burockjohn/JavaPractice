package day24_PracticeTasks;

public class UniqueCharacters {

    public static String uniqueCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }


}

/*

1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"


 */