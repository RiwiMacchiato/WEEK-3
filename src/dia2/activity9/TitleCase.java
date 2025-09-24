package dia2.activity9;

import java.util.ArrayList;

public class TitleCase implements Formatter{

    @Override
    public String format(String s) {
        String[] strings = s.split(" ");
        ArrayList<String> stringsTitleCase = new ArrayList<>();
        for(String stringsito : strings){
            char indexOne = stringsito.charAt(0);
            String indexOneStringUpperCase = Character.toString(indexOne).toUpperCase();
            String newString = indexOneStringUpperCase;

            for(int i = 1; i<stringsito.length(); i++){
                newString += stringsito.charAt(i);
            }

            stringsTitleCase.add(newString);

        }

        String stringToReturn = "";

        for(String stringTitled : stringsTitleCase){
            stringToReturn += stringTitled;
            if(stringsTitleCase.indexOf(stringTitled) != stringsTitleCase.size()){
                stringToReturn += " ";
            }
        }

        return stringToReturn;
    }
    
}
