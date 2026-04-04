class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
        {
            return false;
        }

        int s1window[] =  new int[26];
        int s2window[] = new int[26];

        for(int i = 0 ; i < s1.length() ; i++)
        {
            s1window[s1.charAt(i) - 'a']++;
            s2window[s2.charAt(i) - 'a']++;
        }

        if(matches(s1window,s2window)) return true;

        for(int i = s1.length() ; i < s2.length() ; i++)
        {
            s2window[s2.charAt(i) - 'a' ]++;
            s2window[s2.charAt(i-s1.length()) - 'a']--;
            if(matches(s1window,s2window)) return true;
        }

        return false;
        
        


    }
    private static boolean matches(int s1window[] , int s2window[])
        {
            for(int i = 0 ; i < 26 ; i++)
            {
                if (s1window[i] != s2window[i])
                {
                    return false;
                }
            }
            return true;
        }
}
