#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<string>
using namespace std;
//ʵ��һ������5ֻС�������ش�����������arr[]={200,1000,800,1500,2000},�ҳ���������С��
//int main() {
//	int arr[] = {200,1000,800,1500,150};
//	int temp = 0;
//	for (int i = 0; i < 5; i++) {
//		if (arr[i] > temp)
//			temp = arr[i];
//	}
//	cout << "���ص�С�������Ϊ:" << temp << endl;
//    system("pause");
//	return 0;
//}
//ʵ����������Ԫ�صĵ���
//void print(int arr[],int n) {
//	for(int i =0;i<n;i++)
//	cout << arr[i] << endl;
//}
//int main() {
//	int arr[] = {1,2,3,4,5,6,7,8,9};
// int n = sizeof(arr) / sizeof(arr[0]);
//	cout << "��������ǰ��" << endl;
//	print(arr,n);
//	int temp = 0;
//	int star = 0;
//	int end = n- 1;
//	while (star < end) {
//		temp = arr[star];
//		arr[star] = arr[end];
//		arr[end] = temp;
//		star++;
//		end--;
//	}
//	cout << "���������" << endl;
//	print(arr,n);
//
//	return 0;
//}
//ʵ������ð������
//void Bubble_sort(int arr[],int n) {
//	for (int i = 0; i < n - 1; i++) {
//		for (int j = 0; j < n - i - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j + 1] = temp;
//           }
//		}
//	}
//}
//void print(int arr[], int n) {
//	for (int i = 0; i < n; i++) {
//		cout << arr[i] << " ";
//	}
//	cout << endl;
//}
//int main() {
//	int arr[] = {4,7,8,1,3,6,9,2,5};
//	int n = sizeof(arr) / sizeof(arr[0]);
//	cout << "����ǰ��" << endl;
//	print(arr,n);
//    Bubble_sort(arr,n);
//	cout << "�����" << endl;
//	print(arr,n);
//
//    return 0;
//}
//֪ʶ�㣺��ά����
//һ.��ά����Ĵ�����һ��һ����ֵ�Ĵ���������
//int main() {
	//(1)
	/*int arr2[2][3]={   
	{2,4,5},
	{6,7,8}
	};*/
	//(2)
	//int arr3[][3]={2,6,7,9,1,3};
	/*for(int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			cout << arr3[i][j] << " ";
		}
		cout << endl;
	}*/
//ʵ�������Գɼ�ͳ��
//int main() {
//	int arr[3][3] = {
//		{100,100,90},
//	    {90,80,30},
//	    {50,40,30}
//	};
//	string name[] = {"����","����","����"};
//	for (int i = 0; i < 3; i++) {
//		int sum = 0;
//		for (int j = 0; j < 3; j++) {
//			 sum+=arr[i][j];
//		}
//		cout << name[i]<<"�ĳɼ�Ϊ��"<<sum<< endl;	
//	}
//	return 0;
//}
//��.��ά�������Ƶ�����
	//��1��
	/*cout << "��ά����ĵ�ַΪ��" << arr << endl;
	cout << "��һ�еĵ�ַΪ��" << arr[0] << endl;
	cout << "�ڶ��еĵ�ַΪ��" << arr[1] << endl;
	cout << "��һ�е�һ��Ԫ�صĵ�ַΪ��" << arr[0][0] << endl;
	return 0;
}*/
	//���Ҫ��������ֱ���ö�ά������ռ���ڴ���Զ�Ԫ����ĳһ����ռ�ļ��� ������ĳһ����ռ���ڴ�ֱ�ӳ���һ��Ԫ����ռ���ڴ漴��
//ʾ���ģ���������
	//��src���������һ�������ƶ���dest����
	//void move(char src,char dest)
	//{
	//	cout << src << " --> " << dest << endl;
	//}
	////��n�����Ӵ�src���ƶ���dest�룬��medium����Ϊ��ת
	//void hanoi(int n, char src, char medium, char dest)
	//{
	//	if (n == 1)
	//		move(src, dest);
	//	else {
	//		hanoi(n - 1, src, dest, medium);
	//		move(src, dest);
	//		hanoi(n - 1, medium, src, dest);
	//	}
	//}
	//int main() {
	//	int m;
	//	cout << "Enter the number of diskes: ";
	//	cin >> m;
	//	cout << "the steps to moving " << m << " diskes:" << endl;
	//	hanoi(m, 'A', 'B', 'C');
	//	return 0;
	//}
//ʵ���壺�ݹ���׳�
//int Leo(int n) {
//	long long sum = 0;
//	if(n == 1){
//	return 1;
//	}
//	sum = n * Leo(n-1);
//	return sum;
//}
//int main() {
//	int num = 0;
//	cout << "������һ������:";
//	cin >> num;
//	cout << endl;
//	cout << Leo(num) << endl;
//	return 0;
//}
// ʵ������ð������
//void Bubble_sort(int arr[], int n) {
//	for (int i = 0; i < n - 1; i++) {
//		for (int j = 0; j < n - i - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//				int temp = arr[j+1];
//				arr[j+1] = arr[j];
//				arr[j] = temp;
//			}
//		}
//	}
//}
//	void print(int arr[],int n) {
//		for (int i = 0; i < n; i++) {
//			cout << arr[i] << " ";
//		}
//		cout << endl;
//	}
//	int main() {
//		int arr[] = {4,6,7,9,0,1,2,8,5,3};
//		int n = sizeof(arr) / sizeof(arr[0]);
//		cout << "����ð������ǰ��"<<endl;
//			print(arr,n);
//			cout << "����ð�������" << endl;
//			Bubble_sort(arr,n);
//			print(arr,n);
//			return 0;
//	}
//ʵ���ߣ���������
//void insert_sort(int arr1[], int len) {
//	for (int i = 1; i <len;i++) {
//		int temp = arr1[i];
//		int j = 0;
//		for ( j = i - 1; j >=0 && arr1[j] > temp;j-- ) {
//			arr1[j + 1] = arr1[j];
//		}
//		arr1[j+1] = temp;
//	}
//}
//void daying(int arr1[],int n) {
//	for (int i = 0; i < n; i++) {
//		cout << arr1[i] <<" ";
//	}
//	cout << endl;
//}
//int main() {
//	int arr1[] = {7,3,5,1,8,2,9,4,6};
//	int len = sizeof(arr1)/sizeof(arr1[0]);
//	cout << "����λ��ǰ��"<<endl;
//	daying(arr1,len);
//	cout << "����λ�ú�" << endl;
//	insert_sort(arr1, len);
//	daying(arr1,len);
//    return 0;
//}
//ʵ���ˣ�ϣ�����򣨲�������puls�棩//������
//void shell_sort(int arr[], int len) {
//	int grp = len / 2;
//	for (; grp > 0; grp = grp / 2) {
//		for (int i = grp; i < len; i++) {
//			int temp = arr[i];
//			int j = 0;
//			for (j = i - grp; j >= 0 && arr[j] > arr[j + grp]; j=j-grp) {
//				arr[j + grp] = arr[j];
//			}
//			arr[j + grp] = temp;
//		}
//	}
//}
//void print(int arr[], int n) {
//	for (int i = 0; i < n; i++) {
//		cout << arr[i] << " " ;
//	}
//	cout << endl;
//}
//	int main() {		
//		int arr[] = {6,4,3,9,7,1,5,2,8};
//		int length = sizeof(arr) / sizeof(arr[0]);
//		cout << "����ϣ������ǰ��"<<endl;
//		print(arr,length);
//		shell_sort(arr,length);
//		cout << "����ϣ�������" << endl;
//		print(arr,length);
//}
//֪ʶ�㣻ָ��
//����ָ��
//int main() {
	//int a = 10;
	//int* p = &a;//ָ��Ķ���
	//cout << "ָ��p��ֵΪ��" << p << endl;
	//cout << "a�ĵ�ַΪ��" << & a << endl;
	//*p = 1000;//ָ��Ľ�����
	//cout << "a��ֵΪ��" << a << endl;
	//cout << "*p��ֵΪ��" <<*p << endl;
	//ָ����ռ�ڴ�ռ�Ĵ�С ָ��Ҳ��һ����������
	/*cout<<sizeof(int*)<<endl;
	cout << sizeof(char*) << endl;
	cout << sizeof(float*) << endl;
	cout << sizeof(int*) << endl;
	cout << sizeof(long long*) << endl;
	cout << sizeof(short*) << endl;*/
	//��32λ����ϵͳ��ָ�������ռ���ڴ��С��Ϊ4 ��64λ����ϵͳ��ָ�������ռ�Ĵ�С��Ϊ8
	//Ұָ��Ϳ�ָ��
    //int* p = NULL;  //��ָ�����ڶ�ָ��������г�ʼ�� ���Ǳ���ע�ⲻ�ܶԿ�ָ����ָ����ڴ�ռ���з���
	//*p = 2000;�ò����ǲ��������
	//int* p = (int*)0x1000;  ָ�����ָ��Ƿ����ڴ�ռ� �ڳ���ı�д������һ��Ҫ����Ұָ��ĳ���

    // return 0;
//}


























































































