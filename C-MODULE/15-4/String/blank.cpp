#include <stdio.h>
#include <string.h>

int main() {
    char s[20];
    printf("Enter the string: ");
    scanf("%s", s);

    for (int i = 0; i < strlen(s); i++) {
        if (s[i] % 2 == 0) {
            printf("%c ", s[i]);
        }
    }

    return 0;
}

