#include<iostream>

using namespace std;

class Marvellous        //Encapsulation
{

 //Access Specifier   
public:
int No1, No2;   // Characteristics

void fun()      //Behaviour
{
    cout<<"Inside Fun\n";
}

void gun()      //Behaviour
{
    cout<<"Inside Gun\n";
}

};

int main()

{
    Marvellous mobj1;        //Object Creation (Instance)
    Marvellous mobj2;

    cout<<sizeof(mobj1)<<"\n";   //8
    cout<<mobj1.No1<<"\n";  

    mobj1.fun();  
    mobj2.fun();  
    mobj1.gun();  

    return 0;
}