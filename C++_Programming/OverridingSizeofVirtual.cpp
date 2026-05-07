#include<iostream>

using namespace std;
 class Base     //8
    {
      public: 
        int i,j;

        void fun()
        { cout<<"Inside Base Fun\n"; }

         virtual void gun()
        { cout<<"Inside Base Gun\n"; }
       
         virtual void sun()
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

        virtual void run()      //difination
        {   cout<<"Inside Derived Run\n";   }

    };
   
int main()
{
   cout<<sizeof(Base)<<"\n";        //12
   cout<<sizeof(Derived)<<"\n";     //20

    return 0;
}