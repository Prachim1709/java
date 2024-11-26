package come.basic;
/*
 * In a town, the percentage of men is 52. The percentage of 
total literacy is 48. If total percentage of literate men is 35 of 
the total population, write a program to find the total number 
of illiterate men and women if the population of the town is 
80,000.
 */
public class percentage {
	public static void main(String[] args) {
		
		int total_population, percentage_men, percentage_literacy, percentage_literate_men;
		
		total_population = 80000;
		percentage_men = 52;
		percentage_literacy = 48;
		percentage_literate_men = 35;
		
		 int num_men = 80000 * 52;
		 num_men=4160000/100;
		 
		 int total_literate = 80000 * 48;
		 total_literate=3840000/100;
		 
		 int literate_men = 80000 * 35;
		 literate_men=2800000/100;
		 
		 int num_women = total_population - num_men;
		 int illiterate_men = num_men - literate_men;
		 int illiterate_women = total_literate - literate_men;
		

		 
		 System.out.println("Illiterate men:"+literate_men);
		 System.out.println("Illiterate women:"+illiterate_women);	
	}

}
