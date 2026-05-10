#include<iostream>

using namespace std;
 class Base     //8
    {
      public: 
        int i,j;

        void fun()
        { cout<<"Inside Base Fun\n"; }

         void gun()
        { cout<<"Inside Base Gun\n"; }
       
         void sun()
        { cout<<"Inside Base Sun\n"; }
       

    };

    class Derived: public Base      //16
    {
        public: 
        int x,y;

        void fun()      //Redifination
        {   cout<<"Inside Derived Fun\n";   }

        void sun()      //Redifination
        {   cout<<"Inside Derived Sun\n";   }

        void run()      //difination
        {   cout<<"Inside Derived Run\n";   }

    };
   
int main()
{
    Base *bp = NULL;
    
    bp = new Derived();     // Up casting(allowed)
    bp -> fun();            //Base fun
    bp -> gun();            //Base gun
    bp -> sun();            //Base sun
   // bp -> run();            //Error

    return 0;
}