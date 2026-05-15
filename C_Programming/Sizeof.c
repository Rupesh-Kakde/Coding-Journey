#include<stdio.h>

int main()
{
    char ch = 'A';
    int i = 11;
    float f = 90.99f;
    double d = 78.67890;

    printf("Size of all variables\n");
    printf("%lu \n",sizeof(ch));  // ch  - 1
    printf("%lu\n",sizeof(i));   // i - 4
    printf("%lu\n",sizeof(f));   // f - 4
    printf("%lu\n",sizeof(d));   // d - 8


    return 0;
}