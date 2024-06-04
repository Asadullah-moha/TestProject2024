package strings;

public class StringClass1 {
    public static void main(String[] args) {
        //string is nothing but a sentence, words in it are characters*/
        String name = "Shuvashish"; //referential type:
        System.out.println(name);
        String name1 = "A"; // double ""
        char char1 = 'A'; // Single ''
        int num = 9; //primitive type:

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf(" ")); // this will return value from the String name

        System.out.println(name.replace('a', 'i')); //replace and override a letter
        System.out.println(name.replace("va", ".."));//replace and override multiple characters

        String[] countries = {"Bangladesh", "USA", "France", "India", "italy" }; // array of String
        String str = "Bangladesh, USA, France, India, Italy";
        String[] countries2 = str.split(" ");// if you leave space between quotations you will get the commas
        System.out.println(countries[2]);
        int sum = 0;

        //if we want to print out all the countries we have to create a for loop shown below.
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
            System.out.println(countries2[i]);
            System.out.println(countries2[i].trim());// this will make the output clean, like deleting extra spaces.
            System.out.println(countries[i]);
            sum = countries[i].length() + sum;// number of characters = 29
            //sum = countries[i].length();


        }
        System.out.println(sum);

        // find total number of 'a' in the countries array
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            for (int j = 0; j < country.length(); j++) {
                if (country.charAt(j) == 'a') {
                    count++;

                }
            }
        }
        System.out.println(count);

        //print the name of the country which has the highest length
       int max= 0;
       int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].length()>max) {
                max = countries[i].length();
                index = i;
            }
        }
        System.out.println(countries[index]);

        String city1 = "New York";
        String city2 = "New York";

        //see if the variables are equal
        if (city1.equals(city2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println(city1.contains("New"));
        System.out.println(city1.contains("York"));

        System.out.println(countries[1].charAt(1));
//        String[] countries = {"Bangladesh", "USA", "France", "India", "italy" }; // array of String
        System.out.println(countries[3].charAt(1));
    }
}