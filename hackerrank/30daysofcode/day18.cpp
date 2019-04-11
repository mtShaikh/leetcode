//stacks and queues
#include <iostream>

using namespace std;

class Solution {
    char stack[1000];
    char queue[1000];
    int top, front, rear = -1;

public:
    void pushCharacter(char c) {
        top++;
        stack[top]=c;
    }

    void enqueueCharacter(char c) {
        if (front == - 1)
            front = 0;

        rear++;
        queue[rear] = c;
    }

    char popCharacter() {
       char val = stack[top];
       top--;
       return val;
   }

   char dequeueCharacter() {
    char val = queue[front];
    front++;
    return val;
}

};

int main() {
    // read the string s.
    string s;
    getline(cin, s);

    // create the Solution class object p.
    Solution obj;

    // push/enqueue all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }

    bool isPalindrome = true;

    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;

            break;
        }
    }

    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }

    return 0;
}
