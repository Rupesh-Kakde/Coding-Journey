#include<iostream>
using namespace std;

template <class T>
class Arithmatic
{
    public : 
        T No1;
        T No2;

        Arithmatic(T A, T B)
        {
            this->No1 = A;
            this->No2 = B;
        }

        T Addition()
        {
            T Ans;
            Ans = No1 + No2;
            return Ans;
        }

        T Substraction()
        {
            T Ans;
            Ans = No1 - No2;
            return Ans;
        }

};

int main()
{
    Arithmatic aobj (11,10);            //Error  missing template arguments before 'aobj'

    cout<<aobj.Addition()<<"\n";
    cout<<aobj.Substraction()<<"\n";

    return 0;
}