package dainhat;

public class TimDoDai {


    public int findMaxStringLength(String[] name){
        int max = name[0].length();
        for(int i = 0; i < name.length; i++){
            if(name[i].length() > max){
                max =name[i].length();
            }
        }
        return max;
    }
}
