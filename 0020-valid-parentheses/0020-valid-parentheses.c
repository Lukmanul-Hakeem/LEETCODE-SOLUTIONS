bool isValid(char* s) {
    if(strlen(s)==1)return false;
    char*stack=(char*)malloc((strlen(s)+5)*sizeof(char));
    int i=0;
    int top=-1;
    while(s[i]!='\0'){
        if(s[i]=='('||s[i]=='['||s[i]=='{'){
            top++;
            stack[top]=s[i];
        }else{
            //top--;
            if(top> -1 && (stack[top]+1==s[i]||stack[top]+2==s[i]||stack[top]+2==s[i])){
                top--;
            }
            else{
                return false;
            } 
        }
        i++;
    }
    if(top!=-1)return false;
    return true;

}