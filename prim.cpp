// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    
    Node(int data){
        this->data=data;
        this->next=NULL;
    }
};
void printList(Node* head){
    while(head!=NULL){
        cout<<head->data<<" ";
        head=head->next;
    }
    cout<<endl;
}
int main() {
    // Write C++ code here
    Node* ptr=new Node(10);
    printList(ptr);


    return 0;
}