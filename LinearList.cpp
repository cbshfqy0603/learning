#define _CRT_SECURE_NO_WARNINGS
//��������һ�����ݽṹ,���Ƕ���Ҫ��������(1)�߼��ṹ(2)��������/����(3)�洢/����ṹ
// ���������Ա���˵,���ݴ洢�ṹ�Ĳ�ͬ,���Է�Ϊ˳���(˳��洢)������()
////���þ�̬����ķ�ʽ������˳���
//#include<stdio.h>
//#define MaxSize 10
//typedef struct {
//	int data[MaxSize];
//	int length;
//}SqList;
////��������������ʼ��һ��˳���
//void InitList(SqList &L){
//	for(int i = 0; i < MaxSize; i++){
//		L.data[i] = 0;
//	}
//	L.length = 0;
//}
//int main() {
//	SqList L1;
//	InitList(L1);
//	//�˴������������
//	return 0;
//}
//���ö�̬����ķ�ʽ������˳���
//#include<stdio.h>
//#include<stdlib.h>
//#define InitSize 10
//typedef struct {
//	int* data;
//	int maxsize;
//	int length;
//}SqList;
//void InitList(SqList &L) {
//	L.data = (int*)malloc(InitSize * sizeof(int));
//	L.maxsize = InitSize;
//	L.length = 0;
//}
//void IncreaseSize(SqList &L,int len) {
//	int* p = L.data;
//	L.data = (int*)malloc((L.maxsize + len) * sizeof(int));
//	for (int i = 0; i < L.length; i++) {
//		L.data[i] = p[i];	
//	}
//	L.maxsize = L.maxsize + len;
//	free(p);
//}
//int main() {
//	SqList L2;
//	InitList(L2);
////һЩ����
//	IncreaseSize(L2,5);
//	return 0;
//}
//˳���Ĳ������
//#include<stdio.h>
//#define maxsize 10
//#include<iostream>
//using namespace std;
//typedef struct {
//	int data[maxsize];
//	int length;
//}sqlist;
//void InitList(sqlist& L) {
//	for (int i = 0; i < maxsize; i++) {
//		L.data[i] = 0;
//	}
//	L.length = 0;
//}
//void ListInsert(sqlist& L, int j, int e) {
//	for (int i = L.length; i >= j; i--) {
//		L.data[i] = L.data[i-1];
//	}
//	L.data[j - 1] = e;
//	L.length++;
//}
//int main() {
//	sqlist L1;
//	InitList(L1);
//	for (int i = 5; i >= 0; i--) {
//		L1.data[i] = i;
//		L1.length++;
//	}
//	for (int i = 0; i < L1.length; i++) {
//		cout <<L1.data[i] ;
//	}
//	cout << endl;
//	//����������ڵ�i��λ�ò���Ԫ��e
//	ListInsert(L1, 3, 3);
//	for (int i = 0; i < L1.length; i++) {
//		cout << L1.data[i] ;
//	}
//	cout << endl;
//}
//��������Ż���+ɾ������
#include<stdio.h>
#include<iostream>
#define Maxsize 10
using namespace std;
typedef struct {
	int data[Maxsize];
	int length;
}Sqlist;
void InitList(Sqlist& L) {
	for (int i = 0; i < Maxsize; i++) {
		L.data[i] = 0;
	}
	L.length = 0;
}
bool InsertList(Sqlist& L,int i,int e) {
	if (i<0 || i>L.length) {
		return false;
	}
	if (i > L.length + 1) {
		return false;
	}
	for (int j = L.length; j <= i; j--) {
		L.data[j] = L.data[j - 1];
	}
	L.data[i - 1] = e;
	L.length++;
	return true;
}
//ɾ������
bool ListDelete(Sqlist& L, int i, int& e) {
	if (i<0 || i>L.length) {
		return false;
	}
	if (i > L.length + 1) {
		return false;
	}
	else {
		e = L.data[i - 1];
		for (int j = i; j < L.length; j++) {
			L.data[j - 1] = L.data[j];
		}
		L.length--;
		return true;
	}
}
//��λ����
int LocateElem(Sqlist& L, int i)  {
	return L.data[i-1];
}
//��ֵ����
int locateElem(Sqlist& L, int e) {
	for (int i = 0; i<L.length; i++) {
		if (L.data[i] == e) {
			return i + 1;
		}
	}
}
int main() {
	Sqlist L1;
	InitList(L1);
	//ĳЩ���ز���
	int e = -1;
	if (ListDelete(L1, 3, e))
		printf("������ֵΪ%d\n", e);
	else
		printf("���Ϸ���������");
	return 0;
}













































