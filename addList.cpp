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
    }};
    Node* insert(Node* head,int new_data){
        Node* new_node=new Node(new_data);
        new_node->next=head;
        return new_node;
    }
    void printList(Node* head){
        Node* curr=head;
        while(curr!=NULL){
            cout<<" "<<curr->data;
            curr=curr->next;
        }
        cout<<endl;
    }


int main() {
    // Write C++ code here
    Node* ptr=new Node(10);
    ptr->next=new Node(15);
    ptr->next->next=new Node(67);
    ptr->next->next->next=new Node(50);
    
  int data=3;
  ptr=insert(ptr,data);
 printList(ptr);

    return 0;
}