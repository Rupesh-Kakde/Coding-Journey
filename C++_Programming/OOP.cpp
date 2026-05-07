#include<iostream>

using namespace std;


class Arithmatic
{
    public:

    int No1;
    int No2;

    Arithmatic()
    {
        No1 = 0;
        No2 = 0;
    }

    Arithmatic(int value1, int Value2)
    {
        No1 = value1;
        No2 = Value2;
    }

    int Addition()
{
    int Ans = 0;
    Ans = No1 + No2;
    return Ans;
}

int Substraction()
{
    int Ans = 0;
    Ans = No1 - No2;
    return Ans;
}

};


int main()
{
    Arithmatic aobj(11,10);
    int result = 0;

    result = aobj.Addition();
    cout<<"Addition is :"<<result<<"\n";

    
    result = aobj.Substraction();
    cout<<"Substraction is :"<<result<<"\n";
    return 0;

}
