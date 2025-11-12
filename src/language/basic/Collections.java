package language.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		List <String> area = new ArrayList<String>();
		
		area.add("2350.5sqKm");
		area.add("741sqKm");
		area.add("567.4sqKm");
		area.add("477.99sqKm");
		area.add("1234sqKm");
		
		System.out.println("Total area of 2nd and 3rd city is: " + area.get(2) + " & " + area.get(3));
		
		
		
        Set<String> attractions = new HashSet<String>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Taj Mahal");
        attractions.add("Times Square");
        attractions.add("Disneyland Paris");
        attractions.add("Grand Canyon");
        attractions.add("Colosseum");
        attractions.add("Statue of Liberty");
        attractions.add("Machu Picchu");
        attractions.add("Niagara Falls");
        
        System.out.println("Top 10 Tourist Attractions: " + attractions);
        System.out.println("Total attractions: " + attractions.size());
		
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        float average = (numbers[4] + numbers[5]) / 2f;
        System.out.println("Average of 5th and 6th values: " + average);
        
        
        List<String> movies = new ArrayList<String>();
        movies.add("Avatar");
        movies.add("Bajrangi Bhaijaan");
        movies.add("Seven");
        movies.add("Inception");
        movies.add("Shawshank Redemption");
        
        System.out.println("Third highest-grossing movie: " + movies.get(2));
        
        
        

	}

}
