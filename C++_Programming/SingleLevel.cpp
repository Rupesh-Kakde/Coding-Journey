#include <iostream>
using namespace std;

class Base
{
    public:
        int i, j;

        Base()
        {
            cout<<"Inside Base Constructor\n";
            i = 0;
            j = 0;

        }

        ~Base()
        {
            cout<<"Inside Base Destructor\n";
        }

        void fun()
        {
            cout<<"Inside Base Fun \n";
        }
};

class Derived : public Base
{

};

int main()
{
    //Derived dobj;
    Base bobj;
    return 0;
}

