package util;

public class StringProcessor {

    public String capitalizeName(String name){
        String[] parts = name.toLowerCase().split(" ");
        String output = "";
        // Uppercase first letter in each part
        for(int i=0; i<parts.length; i++){
            output += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
            if (i != (parts.length - 1)){
                output += " ";
            }
        }
        return output.toString();
    }

}
