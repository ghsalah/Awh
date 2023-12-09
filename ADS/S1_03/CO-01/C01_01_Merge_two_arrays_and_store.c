#include <stdio.h>

void main() {
    int n,m,i,j,temp;

    printf("Enter the number of elements in first array \n");
    scanf("%d", &n);
    printf("Enter the number of elements in second array \n");
    scanf("%d", &m);
    
    int arr1[n],arr2[m],arr3[n+m];
    
    printf("Enter %d numbers in first array: \n", n);
    for ( i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
        arr3[i]=arr1[i];
    }
    
    printf("Enter %d numbers in seconds array: \n", m);
    for ( i = 0; i < m; i++) {
        scanf("%d", &arr2[i]);
        arr3[i+n]=arr2[i];
    }
    
    
    printf("\nThe first array is:\n");
    for ( i = 0; i < n; i++) {
        printf("%d ", arr1[i]);
    }
    
    printf("\nThe second array is:\n");
    for ( i = 0; i < m; i++) {
        printf("%d ", arr2[i]);
    }
    
    printf("\nThe elements of array 1 and 2 joined is :\n");
    for ( i = 0; i < n+m; i++) {
        printf("%d ", arr3[i]);
    }
    
    
    printf("\nThe sorte  array is:\n");
    
        for ( i = 0; i < n+m; i++) {
      for ( j = i+1; j < n+m; j++) {
        if(arr3[i]>arr3[j]){
        temp=arr3[i];
        arr3[i]=arr3[j];
        arr3[j]=temp;
        
        }
        
    }
    }
    for (int i = 0; i < n+m; i++) {
        printf("%d ", arr3[i]);
    }
    
    
}


    
