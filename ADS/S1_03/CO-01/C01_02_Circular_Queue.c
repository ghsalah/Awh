#include<stdio.h>
#include<stdlib.h>



int size, ch, stop = 1, new_element, front = -1, rear = -1,search, i;


void main() {
    printf("Enter the Size: ");
    scanf("%d", &size);
    int queue[size];
    while (stop != 0) {
        printf("\n1. Enqueue\n2. Dequeue\n3. Show\n4. Search\n5. End");
        printf("\nEnter the choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                if ((rear + 1) % size == front) {
                    printf("Queue Overflow");
                } else {
                    if (front == -1) {
                        front = 0;
                    }
                    rear = (rear + 1) % size;
                    printf("\nEnter the Element: ");
                    scanf("%d", &new_element);
                    queue[rear] = new_element;
                    printf("\nData has been added");
                }
                break;

            case 2:
                if (front == -1) {
                    printf("Queue Underflow");
                } else {
                    printf("Deleted Element: %d", queue[front]);
                    if (front == rear) {
                        front = rear = -1;
                    } else {
                        front = (front + 1) % size;
                    }
                }
                break;

            case 3:
                if (front == -1) {
                    printf("Queue is empty");
                } else {
                    printf("The queue: ");
                    if (front <= rear) {
                        for (i = front; i <= rear; i++) {
                            printf("%d ", queue[i]);
                        }
                    } else {
                        for (i = front; i < size; i++) {
                            printf("%d ", queue[i]);
                        }
                        for (i = 0; i <= rear; i++) {
                            printf("%d ", queue[i]);
                        }
                    }
                }
                break;

            
            case 4:
             
             if (rear == -1 && front == -1) {
              printf(" Queue is empty \n");
             } else {
             printf("Enter the element: ");
             scanf("%d", &search);
             int found = 0;

        // Search in the circular part of the queue
        for (i = front; i <= rear; i++) {
            if (queue[i] == search) {
                printf("%d found at index %d\n", search, i);
                found = 1;
                break;
            }
        }

        // If not found in the circular part, search in the non-circular part
        if (!found) {
            for (i = front; i <= rear; i++) {
                if (queue[i] == search) {
                    printf("%d found at index %d\n", search, i);
                    found = 1;
                    break;
                }
            }
        }

        if (found == 0) {
            printf("%d not found in the queue\n", search);
        }
    }
    break;
    case 5:
                stop = 0; 
                break;


            default:
                printf("\nInvalid choice");
        }
    }
}
    
    
    
