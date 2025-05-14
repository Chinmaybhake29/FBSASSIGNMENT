#include <stdio.h>

// Check if number is prime or not
int isPrime(int n) {
    if (n < 2) return 0;  // Not prime if less than 2
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return 0; // Not prime if divisible
    }
    return 1; // Prime
}

// Find position of the prime number
int findPosition(int num) {
    int count = 0; // Count how many primes before this
    for (int i = 2; i <= num; i++) {
        if (isPrime(i)) {
            count++;
            if (i == num) {
                return count; // Found the position
            }
        }
    }
    return -1; // Not a prime
}

int main() {
    int a, b;
    printf("Enter two prime numbers: ");
    scanf("%d %d", &a, &b);

    // Find positions
    int pos1 = findPosition(a);
    int pos2 = findPosition(b);

    // Check if both are prime
    if (pos1 == -1 || pos2 == -1) {
        printf("One or both numbers are not prime.\n");
    } else {
        int result = pos1 * pos2;
        printf("Position of %d is: %d\n", a, pos1);
        printf("Position of %d is: %d\n", b, pos2);
        printf("Final Answer (pos1 * pos2): %d\n", result);
    }

    return 0;
}

