#include<iostream>

using namespace std;

class Demo
{
    public:
        int i;          //characteristics
        float f;        //characteristics



        Demo()          //constructor
        {
            cout<<"Inside Constructor";
            i = 0;
            f = 0.0f;
        }


        ~Demo()         //Destructor
        {
            cout<<"Inside Destructor \n";
        }


        void fun()      // Behaviour
        {
            cout<<"Inside fun \n";
        }
};

int main()
{
    cout<<"Inside Main \n";

    Demo dobj;          //object Creation

    cout<<"\n"<<dobj.i<<"\n";
    dobj.fun();

    cout<<"End of Main\n";

    return 0;
}


