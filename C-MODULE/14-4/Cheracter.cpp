#include <stdio.h>

char* mystrchr(const char* str, char ch) {
    while (*str != '\0') {
        if (*str == ch) {
            return (char*)str;  
        }
        str++;
    }
    return NULL;  // if character not found
}

int main() {
    const char* text = "Hello World!";
    char* result = mystrchr(text, 'o');

    if (result != NULL) {
        printf("Found at position: %ld\n", result - text);
    } else {
        printf("Character not found.\n");
    }

    return 0;
}

