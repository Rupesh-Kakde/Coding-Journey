#include<stdio.h>
#include<stdlib.h>


int main()
{
     int i = 0;             //Loop Counter
    int Size = 0;
    float *marks = NULL;

    printf("Enter no of Elements: \n");
    scanf("%d",&Size);

    //Dynamic Memory Allocation
    marks = (float *)malloc(Size * sizeof(float));

  
    printf("Enter Your Marks\n");

    //Iteration
    //        1     2    3
    for(int i = 0; i<Size; i++)
    {
        scanf("%f",&marks[i]);  //4
    }
    
    printf("Entered Marks are: \n");
    
     for(int i = 0; i<Size; i++)
    {
        printf("%f\n",marks[i]); 
    }
   

    free(marks);
    return 0;
    
}