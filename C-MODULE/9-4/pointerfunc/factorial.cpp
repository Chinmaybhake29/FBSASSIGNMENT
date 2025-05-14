#include <stdio.h>

int factorial()
{
    int n, fact = 1;
    int *pfact = &fact;
    int *pn = &n;

    printf("Enter the number: ");
    scanf("%d", pn);

    for (int i = 1; i <= *pn; i++)  // Removed semicolon
    {
        *pfact = (*pfact) * i;
    }

    printf("Factorial Number is: %d", *pfact);
    return 0;
}
main()
{
    factorial();
}

