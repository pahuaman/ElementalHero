#include <iostream>
using namespace std;

class ElementalHero {
public:
    string  Name, Attribute, Type;
    bool    Effect;
    int     Level, ATK, DEF;
public:
    ElementalHero(){}
    ElementalHero(string name, string attribute, string type, bool effect, int level, int atk, int def){
        Name      = name;
        Attribute = attribute;
        Type      = type;
        Effect    = effect;
        Level     = level;
        ATK       = atk;
        DEF       = def;
    }//builder
    void Hero_Print(){
        cout<<"\t\t\tELEMENTAL HERO\n";
        cout<<"Name:  "<<Name<<"\nAttribute:  "<<Attribute<<"\nType  "<<Type<<"\nEffect  "
            <<Effect<<"\nLevel  "<<Level<<"\nATK  "<<ATK<<"\nDEF  "<<DEF;
    }//Hero_print
};//class

int main(){
    ElementalHero B("Bubbleman","Water","Warrior",true,4,800,1200);
    B.Hero_Print();
    return 0;
}//main 
