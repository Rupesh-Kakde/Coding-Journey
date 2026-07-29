#include<stdio.h>

struct Demo   //Not Memory
{
    
    
    int i;      //4
    int *ptr;   //8
    };          //12



int main()
{
    struct Demo dobj;

    printf("Size of Object is : %lu\n",sizeof(dobj)); //Either 8 OR 16 (Depends on OS )
    
    return 0;
}