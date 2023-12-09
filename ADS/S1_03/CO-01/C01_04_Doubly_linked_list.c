#include<stdio.h>
#include<stdlib.h>
struct Node
{
int data;
struct Node *next;
struct Node *prev;
};
void insertFront(struct Node **head, int data) {
struct Node *newNode = (struct Node *) malloc(sizeof(struct Node));
newNode->data = data;
newNode->next = *head;
newNode->prev = NULL;
if (*head != NULL)
{
(*head)->prev = newNode;
}
*head = newNode;
}
void insertBack(struct Node **head, int data) {
struct Node *newNode = (struct Node *) malloc(sizeof(struct Node));
struct Node *last = *head;
newNode->data = data;
newNode->next = NULL;
if (*head == NULL)
{
newNode->prev = NULL;
*head = newNode;
return;
}
while (last->next != NULL) {
last = last->next;
}
last->next = newNode;
newNode->prev = last;
}
void deleteFront(struct Node **head) {
if (*head == NULL)
{
return;
}
struct Node *temp = *head;
*head = (*head)->next;
if (*head != NULL) {
(*head)->prev = NULL;
}
free(temp);
}
void deleteBack(struct Node **head) {
if (*head == NULL)
{
return;
}
struct Node *last = *head;
while (last->next != NULL)
{
last = last->next;
}
if (last->prev != NULL) {
last->prev->next = NULL;
}
else
{
*head = NULL;
}
free(last);
}
int search(struct Node *head, int data) {
struct Node *current = head;
int position = 0;
while (current != NULL) {
if (current->data == data) {
return position;
}
current = current->next;
position++;
}
return -1;
}
void display(struct Node *node)
{
struct Node *last;
printf("\nTraversal in forward direction \n");
while (node != NULL) {
printf(" %d ", node->data);
last = node;
node = node->next;
}
 printf("\nTraversal in reverse direction \n");
while (last != NULL) {
printf(" %d ", last->data);
last = last->prev;
}
}
void insertAtPosition(struct Node **head, int data, int position) {
struct Node *newNode = (struct Node *) malloc(sizeof(struct Node));
newNode->data = data;
struct Node *current = *head;
for (int i = 0; current != NULL && i < position - 1; i++) {
current = current->next;
 }
if (current == NULL) {
printf("Position out of range\n");
free(newNode);
return;
}
newNode->next = current->next;
newNode->prev = current;
if (current->next != NULL) {
current->next->prev = newNode;
 }
current->next = newNode;
}

void deleteAtPosition(struct Node **head, int position) {
if (*head == NULL) {
printf("List is empty\n");
return;
 }
struct Node *current = *head;
for (int i = 0; current != NULL && i < position; i++) {
current = current->next;
 }
 if (current == NULL) {
 printf("Position out of range\n");
 return;
  }
 if (current->next != NULL) {
  current->next->prev = current->prev;
 }
 if (current->prev != NULL) {
  current->prev->next = current->next;
 } else {
 *head = current->next;
  }
 free(current);
}

int main() {
struct Node *head = NULL;
int choice, data, position;
while (1)
{
printf("Insert:1_front 2_back Delete:3_front 4_back 5_Search 6_Display 7_Insert at 8_Delete at 9_Exit \nEnter your choice: ");
scanf("%d", &choice);
switch (choice) {
case 1:
printf("Enter the data to be inserted: ");
scanf("%d", &data);
insertFront(&head, data);
break;
case 2:
printf("Enter the data to be inserted: ");
scanf("%d", &data);
insertBack(&head, data);
break;
case 3:
deleteFront(&head);
break;
case 4:
deleteBack(&head);
break;
case 5:
printf("Enter the element to be searched: ");
scanf("%d", &data);
position = search(head, data);
if (position == -1)
{
printf("%d is not present in the list.\n", data);
}
else
{
printf("%d is present at position %d in the list.\n", data, position);
}
break;
case 6:
display(head);
break;
case 7:
printf("Enter the position and data to be inserted: ");
scanf("%d %d", &position, &data);
insertAtPosition(&head, data, position);
break;
case 8:
printf("Enter the position to be deleted: ");
scanf("%d", &position);
deleteAtPosition(&head, position);
break;
case 9:
exit(0);
default:
printf("Invalid choice.\n");
}
}
return 0;
}
