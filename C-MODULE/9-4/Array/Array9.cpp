#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = 6;
    int k = 2; 

    int temp[k];
    
    for (int i = 0; i < k; i++) {
        temp[i] = arr[n - k + i];
    }

    for (int i = n - 1; i >= k; i--) {
        arr[i] = arr[i - k];
    }

    for (int i = 0; i < k; i++) {
        arr[i] = temp[i];
    }

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}

