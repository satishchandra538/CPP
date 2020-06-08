#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
};
void push(Node **head, int data)
{
    Node *n = new Node();
    n->data = data;
    n->next = *head;
    *head = n;
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
void swap(Node **head, int x, int y)
{
    Node *prevx = NULL, *prevy = NULL, *nodex = *head, *nodey = *head, *temp;
    for (int i = 1; i < x; i++)
    {
        prevx = nodex;
        nodex = nodex->next;
    }
    for (int i = 0; i < y - 1; i++)
    {
        prevy = nodey;
        nodey = nodey->next;
    }
    prevx->next = nodey;
    prevy->next = nodex;
    temp = nodex->next;
    nodex->next = nodey->next;
    nodey->next = temp;
}
int main()
{
    Node *head = NULL;
    push(&head, 7);
    push(&head, 6);
    push(&head, 5);
    push(&head, 4);
    push(&head, 3);
    push(&head, 2);
    push(&head, 1);
    print(head);
    swap(&head, 2, 6);
    cout<<"----------------\n";
    print(head);
    return 0;
}