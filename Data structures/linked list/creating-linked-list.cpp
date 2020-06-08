#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
};
void push(int data, Node **head)
{
    Node *newnode = new Node();
    newnode->data = data;
    newnode->next = *head;
    *head = newnode;
}
void appendat(Node **head, int data, int loc)
{
    Node *n = new Node();
    Node *trav = new Node();
    trav = *head;
    n->data = data;
    for (int i = 1; i < loc-1; i++)
        trav = trav->next;
    n->next = trav->next;
    trav->next = n;
}
void print(Node *head)
{
    Node *d = head;
    while (d)
    {
        cout << d->data << '\n';
        d = d->next;
    }
}
int main()
{
    Node *head = NULL;
    push(10, &head);
    push(11, &head);
    push(12, &head);
    appendat(&head,99,2);
    print(head);
    return 0;
}
