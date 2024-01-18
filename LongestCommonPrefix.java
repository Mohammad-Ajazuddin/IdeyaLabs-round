import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strarr = {"geeksforgeeks","geeks","geek","geezer"};
        int n = strarr.length;
        int minLenStr = Integer.MAX_VALUE;
        int minMatch = Integer.MAX_VALUE;
        int minInd = 0;
        for(int i=0;i<n;i++)
        {
            if(minLenStr>strarr[i].length())
            {
                minLenStr = strarr[i].length();
                minInd = i;
            }
        }

        for(int i=0;i<n;i++)
        {
            int match = 0;
            int j=0;
            int k = 0;
            if(i==minInd)
                continue;
            while(j<minLenStr)
            {
                if(strarr[i].charAt(j)==strarr[minInd].charAt(j))
                {
                    match++;
                    j++;
                }
                else{
                    break;
                }
            }

            if(minMatch>match)
            {
                minMatch = match;
            }

            if(minMatch==0)
            {
                System.out.println("No Common Prefix");
                break;
            }
        }

        if(minMatch!=0)
        {
            System.out.println("The common Prefix is");
            for(int l=0;l<minMatch;l++)
            {
                System.out.print(strarr[minInd].charAt(l));
            }
        }
    }
}
