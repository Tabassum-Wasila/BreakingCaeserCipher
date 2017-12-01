import edu.duke.*;
 
 public class WordLengths {
 	public void countWordLengths(FileResource resource, int counts[])
 	{
 		int k = counts.length;
 		k--;
 		for(String s : resource.words())
 		{
 			int l = s.length();
 			if( !Character.isAlphabetic( (s.charAt(0) ) ) )
 			{
 				l--;
 			}
 			if( !Character.isAlphabetic( (s.charAt(s.length() - 1) ) ) )
 			{
 				l--;
 			}
 			if( l >= k)
 			{
 				counts[k]++;
 			}
 			else
 				counts[l]++;
 		}
 	}
 	public void testCountWords()
 	{
 		FileResource fr = new FileResource();
 		int counts[] = new int[31];
 		countWordLengths(fr, counts);
 		for(int i = 0; i < 31; i++)
 			System.out.println(counts[i] + " words of length " + i);
 		int max = indexOfMax(counts);
 		System.out.println(max);
 	}
 	public int indexOfMax(int values[])
 	{	int index = 0;
 		int l = values.length;
 		int mx = values[0];
 		for(int i = 1; i < l; i++)
 		{
 			if(mx < values[i])
 			{
 				mx = values[i];
 				index = i;
 			}
 		}
 		return index;
 	}
 	public static void main(String[] args)
 	{
 		WordLengths wl = new WordLengths();
 		wl.testCountWords();
 	}
 }