/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int n) {
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = getRandomNumber();
        }
        return num;
    }

    public static int getRandomNumber(){
        int x = (int) (Math.random()*((6-1)+1))+1;
        return x;
    }

    public static boolean containsDuplicates(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr.length; j++) {
                if (i != j) {
                    if (inputArr[i] == inputArr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int calculateAverage(int[] inputArr) {
        int sum = 0;
        for(int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
        }
        return sum/inputArr.length;
    }

    public int [] twoDArray(int[][] inputArr) {
        double currentAverage = 0;
        double previousAverage = 0;
        int[] resultArray = {};
        boolean firstTime = true;

        for(int i = 0; i < inputArr.length; i++) {
            currentAverage = calculateAverage(inputArr[i]);
            if(firstTime){
                previousAverage = currentAverage;
                resultArray = inputArr[i];
                firstTime = false;
            }
            if(currentAverage < previousAverage){
                resultArray = inputArr[i];
                previousAverage = currentAverage;
            }
        }
        return resultArray;

    }

    public HashSet<Integer> weatherData(int[][] inputArr) {
        HashSet<Integer> array = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i < inputArr.length; i++) {
            for(int j = 0; j < inputArr[i].length; j++) {
                array.add(inputArr[i][j]);
            }
        }
        int max = Collections.max(array);
        int min = Collections.min(array);
        result.add(max);
        result.add(min);

        for(int i = min+1; i < max - 1; i++){
            if(!array.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public String tally(ArrayList<String> list) {
        HashMap<String, Integer> characterCounts = new HashMap<>();
        String[] characters = new String[]{"Bush", "Shrub", "Hedge"};
        for (String c : characters) {
            characterCounts.put(c, 0);
        }
        for(String character : list) {
            if(list.contains(character)) {
                int countSoFar = characterCounts.get(character);
                characterCounts.put(character, countSoFar + 1);
            }
        }
        String result =Collections.max(characterCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        return result;
    }
}
