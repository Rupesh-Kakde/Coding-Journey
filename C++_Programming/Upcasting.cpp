#include<iostream>

using namespace std;
 class Base     //8
    {
      public: 
        int i,j;

    };

    class Derived: public Base      //16
    {
        public: 
        int x,y;
      
    };
   
int main()
{
    Base *bp = NULL;
    Derived dobj;
    bp = &dobj;     // Up casting(allowed)

    return 0;
}