// uva 00272
// TeX Quotes
// by Kent Wong

#include <cstdio> /* this is the c standard input output library */
#include <cstring> /* header function to allow us to manipulate strings and arrays */


int main() {
    char inputLine[1024]; // declare char array called line with 1024 spaces
    bool open = true; // declare bool type and initialize to true

    while (gets(inputLine)) {
        int length = strlen(inputLine); // this uses string length operation from <cstring> to get length

        for (int i = 0; i < length; i++) { // for loop, intit i to 0, and loopguard is count is less than length, inc
            if (inputLine[i] == '"') { // if inputLine array position is equal to quotes, then .
                if (open) // and if we know we are "open" (Default is yes) then we need to replace with openers, ``
                    printf("``");  // append openers ``
                else
                    printf("''"); // otherwise append closers ''

                open = !open; // "toggle" the open bool. goes from open to close to ensure proper quotes are used
            } else
                printf("%c", inputLine[i]); // %c is the char specifier in printf, print the ith number in the inputline
        }
        printf("\n"); // print new line
    }

    return 0;
}
