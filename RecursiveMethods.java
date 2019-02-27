/*
 *	Programmer #1:
 *	Programmer #2:
 */

public class RecursiveMethods {
	/* Builds a string of a single character repeated length number
	 * of times.
	 * 
	 * Consider a call to buildStringOfCharacters('*', 5), the recursive
	 * algorithm will return a single * character and then call 
	 * buildStringOfCharacters('*', 4) to build the rest of the string.
	 * 
	 * @return a String of character, ch. The length is determined
	 * 			by the second parameter, length.
	 * @param	ch		the characters of the returned string
	 * @param	length	the number of characters in the returned string
	 */

	public static String buildStringOfCharacters(char ch, int length) 
	{
		if(length == 0)
		{
			return "";
		}
		
		String characters = "" + ch;
		
		return characters + buildStringOfCharacters(ch, length - 1);
	}

	/* Reverse an array recursively
	 * 
	 * Consider an array, nums that has these elements {1, 3, 5, 7, 9, 11}, 
	 * the recursive algorithm can swap elements if it knows 
	 * which indexes to use in the swap. For example a call 
	 * reverseNumArray(nums, nums.length - 1) could swap the first and
	 * last element so that nums is now {11, 3, 5, 7, 9, 1}. Then, it
	 * can recursively call the method with a smaller index (backIndex - 1)
	 * to provide the next swap --> {11, 9, 5, 7, 3, 1}
	 * 
	 * What will stop the recursion? Compare the indexes for the swap to
	 * provide a base case.
	 * 
	 * @return an int array that has the elements in reverse order
	 * 			of the parameter array, nums. 
	 * Process this recursively beginning with the last element.
	 */
	public static int[] reverseNumArray(int[] nums, int backIndex) 
	{
		
		if(backIndex == nums.length / 2)
		{
			return nums;
		}
		
		int swapToBack = nums[(nums.length - 1) - backIndex];
		
		nums[(nums.length - 1) - backIndex] = nums[backIndex];
		nums[backIndex] = swapToBack;
	
		return reverseNumArray(nums, backIndex - 1);
		
	}

	/* Check if array is sorted in ascending order.
	 * 
	 * Consider the following array, nums {2, 4, 6, 7, 3, 8, 10}
	 * We want to know if it is sorted from lowest to highest. We can
	 * look at the first element, the one at index 0. If the element at
	 * index 0 is less than the element at index 1, we know at least that
	 * element is in ascending order. The recursive step looks at the 
	 * sub-array that begins at the next index.
	 * 
	 * What happens when the method finds that the first element in
	 * the sub-array ({7, 3, 8, 10}) is greater than the next element?
	 * The array isn't in ascending order, so return false.
	 * 
	 * What's the other base case?
	 * 
	 * Process this recursively beginning with the first element.
	 * 
	 * @param 	values		an array of integers
	 * @param	firstIndex	starting index of the sub-array to be processes
	 * @return 	true if the int array parameter is sorted from smallest
	 * 			to largest, false otherwise.
	 */
	public static boolean isSmallestToLargest(int[] values, int firstIndex) 
	{
		if(firstIndex == values.length - 1)
		{
			return true;
		}
		
		if(values[firstIndex] < values[firstIndex + 1] || values[firstIndex] == values[firstIndex + 1])
		{
			return isSmallestToLargest(values, firstIndex + 1);
		}
		
		return false;
	}

	/* Try this one without any hints. "kayak" and "noon" are palindromes.
	 * 
	 * @param	str		the string being evaluated
	 * @param	begin	the index of a character at the front of the string
	 * @param 	end		the index of a character at the back of the string
	 * @return true if the parameter String, str is a palindrome
	 * 			false otherwise
	 */
	public static boolean isPalindrome(String str, int begin, int end) 
	{
		if(begin == end || (str.length() % 2 == 0 && (begin + 1 == end)))
		{
			return true;
		}
		
		if(str.charAt(begin) == str.charAt(end))
		{
			return isPalindrome(str, begin + 1, end - 1);
		}
		
		
		return false;
	}
}
