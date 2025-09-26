package Exercises.Activity_9;

 class TitleCase implements Formatter{

        public String format(String s){

            String[] words = s.split("");
            StringBuilder sb = new StringBuilder();
            for (String word: words){
                if(!word.isEmpty()){
                    sb.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append("");
                }
            }
            return sb.toString().trim();
        }

    }



