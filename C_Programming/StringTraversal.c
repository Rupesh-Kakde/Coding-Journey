#include<stdio.h>

int main()
{
    char str[] = "Ganesh";
    char *ptr = NULL;       //1 byte 

    ptr = str;      //100


    while (*ptr !='\0')
    {
         printf("%c\n",*ptr);        
        ptr++;     

    } 


    return 0;

}