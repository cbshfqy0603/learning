#define _CRT_SECURE_NO_WARNINGS
//对于任意一种数据结构,我们都需要分析它的(1)逻辑结构(2)基本运算/操作(3)存储/物理结构
// 而对于线性表来说,根据存储结构的不同,可以分为顺序表(顺序存储)和链表()
////利用静态分配的方式来定义顺序表
//#include<stdio.h>
//#define MaxSize 10
//typedef struct {
//	int data[MaxSize];
//	int length;
//}SqList;
////基本操作——初始化一个顺序表
//void InitList(SqList &L){
//	for(int i = 0; i < MaxSize; i++){
//		L.data[i] = 0;
//	}
//	L.length = 0;
//}
//int main() {
//	SqList L1;
//	InitList(L1);
//	//此处添加其他操作
//	return 0;
//}
//利用动态分配的方式来定义顺序表
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
////一些操作
//	IncreaseSize(L2,5);
//	return 0;
//}
//顺序表的插入操作
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
//	//插入操作：在第i个位置插入元素e
//	ListInsert(L1, 3, 3);
//	for (int i = 0; i < L1.length; i++) {
//		cout << L1.data[i] ;
//	}
//	cout << endl;
//}
//插入操作优化版+删除操作
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
//删除操作
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
//按位查找
int LocateElem(Sqlist& L, int i)  {
	return L.data[i-1];
}
//按值查找
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
	//某些神秘操作
	int e = -1;
	if (ListDelete(L1, 3, e))
		printf("巴拉拉值为%d\n", e);
	else
		printf("不合法巴拉巴拉");
	return 0;
}













































