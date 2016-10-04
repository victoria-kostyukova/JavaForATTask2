package exercise4.objects;

import java.util.Comparator;

/**
 * Created by Viktoryia_Kastsiukov on 10/4/2016.
 */
public class TitleComparator implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        return (stringCompare(o1.getTitle(), o2.getTitle()));
    }
    public static int stringCompare(String one, String two){
        if (one != two){
            char [] first = one.toCharArray();
            char [] second = two.toCharArray();
            if (first.length > second.length){
                for (int i = 0; i <second.length; i++){
                    if(letterCompare(first[i], second[i]) !=0 ){
                        return letterCompare(first[i], second[i]);

                    }
                }
                return 1;
            } else {
                for (int i = 0; i <first.length; i++){
                    if(letterCompare(first[i], second[i]) !=0 ){
                        return letterCompare(first[i], second[i]);

                    }
                }
                return -1;
            }

        } else {
            return 0;
        }
    }

    public static int letterCompare(char a, char b){
        if (a != b){
            if(a>b){
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

}