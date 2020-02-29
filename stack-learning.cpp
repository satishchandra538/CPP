#include <iostream>
using namespace std;
#define max 100
class Stack
{
    int top;

public:
    int array[max] = {0};
    Stack()
    {
        top = -1;
        //cout<<"top = "<<top;
    }
    bool push(int num);
    bool pop();
    bool isempty();
    int peek();
    int print()
    {
        for (int i = 0; i < 10; i++)
        {
            cout << "arr[" << i << "] = " << array[i] << "\n";
        }
        return 0;
    }
};
bool Stack::push(int num)
{
    if (top >= max - 1)
    {
        cout << "stack Overflow top = "<<top<<".\n";
        return false;
    }
    else
    {
        array[++top] = num;
        cout << num << " pushed to stack.\n";
        return true;
    }
}
bool Stack::pop()
{
    if (top < 0)
    {
        cout << "stack underflow.\n";
        return false;
    }
    else
    {
        array[top] = 0;
        top--;
        return true;
    }
}
int Stack::peek()
{
    if (top < 0)
    {
        cout << "stack is empty.\n";
        return 0;
    }
    else
    {
        int x = array[top];
        return x;
    }
}
bool Stack::isempty()
{
    return top < 0 ? true : false;
}

int main()
{
    class Stack s;

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    s.push(7);
    s.print();
    cout << s.pop() << "popped from stack.\n";
    s.print();
    return 0;
}