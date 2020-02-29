#include <bits/stdc++.h>
using namespace std;
class Stacknode
{
public:
    int data;
    Stacknode *next;
};
Stacknode *newnode(int data)
{
    Stacknode *newnode = new Stacknode();
    newnode->data = data;
    newnode->next = NULL;
    return newnode;
}
int push(Stacknode **root, int data)
{
    Stacknode *stacknode = newnode(data);
    stacknode->next = *root;
    *root = stacknode;
    cout << "pushed\n";
    return 0;
}
int pop(Stacknode **root)
{
    Stacknode *temp = *root;
    *root = temp->next;
    free(temp);
    return 0;
}
int print(Stacknode *root)
{
    Stacknode *temp = root;
    while(temp!=NULL)
    {
        cout << temp->data << "\n";
        temp=temp->next;
    }
    return 0;
}
int main()
{
    Stacknode *root = NULL;
    push(&root, 12);
    push(&root, 19);
    push(&root, 72);
    push(&root, 65);
    push(&root, 12);
    push(&root, 19);
    push(&root, 72);
    push(&root, 65);
    print(root);
    return 0;
}