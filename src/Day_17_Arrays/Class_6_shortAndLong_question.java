package Day_17_Arrays;

public class Class_6_shortAndLong_question {
    public static void main(String[] args) {

        //Question 6- Create a method that prints the longest and shortest words in a given String array.


        String[] namearr = {"Kaan" , "Bahadir" , "Aysa" , "Esra" , "Ali" , "Mohammad" , "su"};

        shortestAndlongest(namearr);


    }
    public static void shortestAndlongest(String[] namearr){
        String longestWord = namearr[0];
        String shortestWord = namearr[0];

        for (int i = 0; i <namearr.length; i++) {

            if (namearr[i].length()>longestWord.length()){
                longestWord=namearr[i];

            }

            if (namearr[i].length()<shortestWord.length()){
                shortestWord = namearr[i];
            }

        }
        System.out.println("the longest word is; " +longestWord);
        System.out.println("the shortest word is " +shortestWord);


    }



}
