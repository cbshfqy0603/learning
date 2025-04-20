#define _crt_secure_no_warnings
#include<stdio.h>
void insert_sort(int arr[], int size) {
	int i = 0;
	int j = 0;
	int temp = 0;
	for (i = 1; i < size; i++) {
		temp = arr[i];
		for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
			arr[j + 1] = arr[j];
		}
		arr[j+1]=temp;
	}
}
	void print(int arr[], int size) {
		for ( int i = 0; i < size; i++) {
			printf(" %d", arr[i]);
	}
	printf("\n");
}
int main() {
	int arr[8] = {7,6,9,3,1,5,2,4};
	int size = sizeof(arr) / sizeof(arr[0]);
	printf("Î´µ÷»»Ë³ÐòÇ°£º");
		print(arr, size);
	insert_sort(arr, size);
	printf("µ÷»»Ë³Ðòºó£º"); 
	print(arr,size);
	return 0;
}
//#include<stdio.h>{



//}