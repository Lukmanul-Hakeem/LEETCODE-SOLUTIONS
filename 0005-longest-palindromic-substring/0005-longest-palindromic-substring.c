int checkpalindrome(char s[],int i,int j){
    int x=j-i;
    while(i<j){
        if(s[i]!=s[j])return -1;
        i++;
        j--;
    }
    return x;
}
char* longestPalindrome(char* s) {
    char*string=(char*)malloc((strlen(s)+5)*sizeof(char));
    int max=0;
    int i=0;
    //int z=0;
    int j=strlen(s)-1;
    int a=0;
    while(i!=strlen(s)){
        while(i<j){
            if(s[i]==s[j]){
                int x=checkpalindrome(s,i,j);
                if(max<x){
                    max=x;
                    int z=0;
                    for(int k=i;k<=j;k++){
                        string[z]=s[k];
                        z++;
                    }
                    a=z;
                    string[z]='\0';
                }
            }
            j--;
        }
        i++;
        j=strlen(s)-1;
    }
    if(a==0){
        string[0]=s[0];
        string[1]='\0';
    }
    return string;
}