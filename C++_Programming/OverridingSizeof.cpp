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
   cout<<sizeof(Base)<<"\n";        //8
   cout<<sizeof(Derived)<<"\n";     //16

    return 0;
}