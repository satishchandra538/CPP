#include <bits/stdc++.h>
using namespace std;

class Paranthesis
{
public:
    char symbol;
    Paranthesis *next;
};
Paranthesis *createstack(char symbol)
{
    Paranthesis *newnode = new Paranthesis();
    newnode->symbol = symbol;
    newnode->next = NULL;
    return newnode;
}
void push(Paranthesis **root, char symbol)
{
    Paranthesis *pushing = createstack(symbol);
    pushing->next = *root;
    *root = pushing;
}
void pop(Paranthesis **root)
{
    Paranthesis *poping = *root;
    *root = poping->next;
    delete(poping);
}
int main()
{
    Paranthesis *root = NULL;
    string str = "[{()}]";
    for (int i = 0; i < str.length(); i++)
    {
        if (str.at(i) == '[' || str.at(i) == '(' || str.at(i) == '{')
        {
            push(&root, str.at(i));
        }
        if (str.at(i - 1) == str.at(i))
        {
            pop(&root);
        }
    }
    if (!root)
    {
        cout << "sahi hai bro perfect hai";
    }
    return 0;
}