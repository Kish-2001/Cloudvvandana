class Pangram 
	{
    public static void main(String[] args) 
		{
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) 
		{
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) 
		{
        boolean[] seen = new boolean[26];
        int totalUniqueLetters = 0;

        for (char c : input.toCharArray())
			{
            if (Character.isLetter(c)) 
				{
                int index = Character.toLowerCase(c) - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    totalUniqueLetters++;
                }
                if (totalUniqueLetters == 26) 
				{
                    return true;
                }
            }
        }

        return false;
    }
}
