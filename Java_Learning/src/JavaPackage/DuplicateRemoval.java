package JavaPackage;

public class DuplicateRemoval {
	public static void removeDuplicates(char s[], int n)
    {
        String ans="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
					// Breaking here because this caharacter is already added because it was found earlier
                    break;     
                }               
                               
            }
			// The loop ends without breaking, it means this first occurence of this character in the string
            if(j==i){           
                ans+=s[i];      
            }                  
        }
        System.out.print(ans);
    }
	//Main Method
    public static void main(String[] args)
    {
        char s[] = "aaabaababbccbccdeeeffffggghhhhiiiijjjjkkkk".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }


}
