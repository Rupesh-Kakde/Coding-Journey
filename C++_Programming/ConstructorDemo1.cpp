#include<iostream>

using namespace std;

class Marvellous        //Encapsulation
{

 //Access Specifier   
public:
int No1, No2;   // Characteristics


Marvellous()    //Default Constructor
{
    cout<<"Inside Default COnstructor\n";
    No1 = 0;
    No2 = 0;
    

}

Marvellous(int A, int B)    //Parameterized  Constructor
{
    cout<<"Inside Parameterized COnstructor\n";
    No1 = A;
    No2 = B;
    

}

Marvellous(Marvellous &ref)     //Copy Constructor
{
    cout<<"Inside Copy COnstructor\n";
    No1 = ref.No1;
    No2 = ref.No2;
}


~Marvellous()       //Destructor
{
    cout<<"Inside Destructor\n";
}


};



int main()

{
    cout<<"Inside Main\n";
   Marvellous mobj1;          //Default
   Marvellous mobj2(11,21);     //Parameterized
   Marvellous mobj3(mobj2);     //Copy

    cout<<"End of Main\n";
    return 0;

}   //All Destructor gets Called