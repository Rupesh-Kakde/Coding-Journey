#include<stdio.h>

int main()
{
    //Static Memory Allocation
    float marks[5];        //20 bytes
    
    int i = 0;             //Loop Counter

    printf("Enter Your Marks\n");

    //Iteration
    //        1     2    3
    for(int i = 0; i<5; i++)
    {
        scanf("%f",&marks[i]);  //4
    }
    
    printf("Entered Marks are: \n");
    
     for(int i = 0; i<5; i++)
    {
        printf("%f\n",marks[i]); 
    }
   


    return 0;
    
}