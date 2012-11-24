#include <stdio.h>
#include <stdlib.h>

#include <assert.h>

void printarray (int* arr, const int arrlen) {
	printf("[");
	int i;
	for (i = 0; i < arrlen; i++)
		if (i == 0) printf("%d", arr[i]);
		else printf(", %d", arr[i]);
	printf("]\n");
}

void ksort (const int k, int* arr, const int len) {
	int i, j, e, offset;
	for (offset = 0; offset < k; offset++) {
		for (i = offset; i < len - k; i = i + k + offset) {
			e = arr[i+k];
			j = i;
			while (j >= 0 && e < arr[j]) {
				arr[j+k] = arr[j];
				j = j-k;
			}
			arr[j+k] = e;
		}
	}
}

void shellsort (int* arr, const int arrlen, int* seq, const int seqlen) {
	int i;
	for (i = seqlen - 1; i >= 0; i--) {
		ksort (seq[i], arr, arrlen);
	}
}

int main (void) {
	int sequence[] = { 1, 4, 13, 40, 121, 364, 1093 }; // knuth's seq
	const int arlen = 5;
	int input[] = { 5, 4, 3, 2, 1 };
	shellsort(input, arlen, sequence, 3);
	printarray(input, arlen);
	return EXIT_SUCCESS;
}
