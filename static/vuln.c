#include <stdio.h>
#include <malloc.h>

int main() {
    setbuf(stdout, NULL);
    char secret[100];
    FILE *file = fopen("flag.txt", "r");
    fgets(secret, sizeof secret, file);
    char* input = calloc(301 * sizeof (char), sizeof (char));
    printf("Please enter a string and I will echo it back to you!\n");
    scanf("%300s", input);
    printf(input);
    printf("\n");
    free(input);
}