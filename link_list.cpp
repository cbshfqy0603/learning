//#include<stdio.h>
//#include<iostream>
//using namespace std;
//对于顺序表和链表，这两者的区别只有是用顺序存储的方式来还是用链式存储的方式表示“线性表”这一个逻辑结构
//链式存储的优点是不要求大量存储空间，改变容量方便，缺点是不可随机存取，需要耗费一定的空间来存储指针
//顺序存储的优点是随机存取，存储密度高，缺点是要求大量存储空间，改变容量不方便
//不带头节点的链表：
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = NULL;//防止有脏数据
//	return true;
//}
//int main() {
//	linklist L;
//	//初始化一个空表
//	InitList(L);
//}
////带头节点的链表
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)	//分配内存失败
//		return false;
//	L->next = NULL;
//	return true;
//}
//int main() {
//	linklist L;
//	//初始化链表
//	InitList(L);
//	//某些神秘操作
//}
//有头节点按位序插入
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode *next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode *)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
//bool ListInsert(linklist& L,int i,int e) {
//	if (i < 1)
//		return false;
//	LNode *p;
//	p = L;
//	int j = 0;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;
//	LNode* s;
//	s = (LNode*)malloc(sizeof(LNode));
//	s->data = e;
//	s = p->next;
//	p->next = s;
//	return true;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//某些神秘操作
//ListInsert(L,5,7);
//}
//无头节点的位序插入
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = NULL;
//	return true;
//}
//bool ListInsert(linklist& L,int i,int e) {
//	if (i < 1)
//		return false;
//	if (i == 1) {
//		LNode* s = (LNode*)malloc(sizeof(LNode));
//		s->data = e;
//		s->next = L;
//		L = s;
//		return true;
//	}
//	LNode* p = L;
//	int j = 1;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;
//	LNode* s = (LNode*)malloc(sizeof(LNode));
//	s->data;
//	s->next = p->next;
//	p->next = s;
//	return true;
//}
//int main() {
//	linklist L;
//	//初始化链表
//	InitList(L);
//
//}
//指定结点的后插操作-无论是有无头结点，关键的算法部分都是相同的
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
//bool InsertNextNode(LNode* p,int e) {
//	if (p == NULL)
//		return false;
//	LNode* s = (LNode*)malloc(sizeof(LNode));
//	if (s == NULL)
//		return false;//内存分配失败
//	s->data = e;
//	s->next = p->next;
//	p->next = s;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//某些操作
//
//	//InsertNextNode(p,5);
//
//
//}
//指定结点的前插操作-无论是有无头结点，关键的算法部分都是相同的
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
//bool InsertpriorNode(LNode* p,int e) {
//	if (p == NULL)
//		return false;
//	LNode* s = (LNode*)malloc(sizeof(LNode));
//	if (s == NULL)
//		return false;
//	s->next = p->next;
//	p->next = s;
//	s->data = p->data;
//	p->data = e;
//	return true;
//}
//int main() {
//	linklist L;
//	InitList(L);
//
//
//}
//按位序删除（带头结点）
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
//bool ListDelete(linklist& L, int i,int& e) {
//	if (i < 1)
//		return false;
//	LNode* p = L;
//	int j = 0;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;
//	if (p->next == NULL)
//		return false;
//	LNode* q = p->next;
//	e = q->data;
//	p->next = q->next;
//	free(q);
//	return true;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//......
//	//ListDelete(L,i,e)注：L和e要传地址过去
//}
//按位序删除（不带头结点）
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = NULL;
//	return true;
//}
//bool ListDelete(linklist& L,int i,int& e) {
//	if (i < 1)
//		return false;
//	if (i == 1) {
//		e = L->data;
//		LNode* q = L;
//		L = q->next;
//		free(q);
//		return true;
//	}
//	LNode* p = L;
//	int j = 1;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;
//	if (p->next == NULL)
//		return false;
//	LNode* s = p->next;
//	p->next = s->next;
//	free(s);
//	return true;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//......
//
//}
// 删除指定结点p
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
////^(*￣(oo)￣)^注：此法对于p的下一个位为NULL毫无办法
//换言之如过p是最后一个结点，你只能从表头依次找p的前驱，时间复杂度为O（n）
//bool DeleteNode(LNode*& p,int& e) {
//	if (p == NULL)
//		return false;
//	LNode* q = p->next;
//	e = p->data;
//	p->data = q->data;
//	p->next = q->next;
//	free(q);
//	return true;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//......
//}
//单链表实战
//#include<stdio.h>
//#include<iostream>
//using namespace std;
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)
//		return false;
//	L->next = NULL;
//	return true;
//}
//LNode* GetElem(linklist L,int i) {
//	LNode* p = L;
//	int j = 0;
//	while (p != NULL && j < i ) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return NULL;
//	return p;
//}
////指定位序的插入操作
//bool ListInsert(linklist& L,int i,int e) {
//	/*LNode* p = L;
//	int j = 0;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;*/ //封装获取p指针的代码
//	LNode* p = GetElem(L, i - 1);
//	if (p == NULL)
//		return false;
//	LNode* s = (LNode*)malloc(sizeof(LNode));
//	if (s == NULL)
//		return false;
//	s->data = e;
//	s->next = p->next;
//	p->next = s;
//	return true;
//}
////指定结点的后插操作
//bool InsertNextNode(LNode*& p,int e) {
//	if (p == NULL) {
//		return false;
//	}
//	LNode* s = (LNode*)malloc(sizeof(LNode));
//	if (s == NULL)
//		return false;
//	s->data = e;
//	s->next = p->next;
//	p->next = s;
//	return true;
//}
////删除指定位序的结点
//bool ListDelete(linklist& L,int i,int& e) {
//	if (L == NULL)
//		return false;
//	LNode* p = GetElem(L,i-1);
//	if (p == NULL)
//		return false;
//	else if (p->next == NULL)
//		return false;
//	LNode* q = p->next;
//	e = q->data;
//	p->next = q->next;
//	free(q);
//}
////打印链表
//void PrintList(linklist p) {
//	while (p) {
//		cout << p->data << "->";
//		p = p->next;
//	}
//	cout << "NULL" << endl;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	int j = 0;
//	int x = 0;
//	LNode* r = L;
//	//尾插法
//	while (j < 10) {
//		cin >> x;
//		LNode* s = (LNode*)malloc(sizeof(LNode));
//		if (s == NULL)
//			return false;
//		s->data = x;
//		r->next = s;
//		r = s;
//		j++;
//	}
//	r->next = NULL;
//前插法
// while(j<10){
// cin>>x;
// LNode* s = (LNode*)malloc(sizeof(LNode));
// s->data = x;
// s->next = L->next;
// L->next = s;
// j++;
// } 
//cout << "创建链表："<<endl;
//	PrintList(L->next);
//	//在指定位序插入结点
//	cout << "在第" << 5 << "位插入结点后：" << endl;
//	ListInsert(L, 5, 98);
//	PrintList(L->next);
//	//指定结点的后插操作
//	LNode* p = GetElem(L,8);
//	InsertNextNode(p, 10000);
//	cout << "在指定结点p后面进行后插操作："<<endl;
//	PrintList(L->next);
//	//删除指定位序的结点
//	int e = 0;
//	ListDelete(L, 3, e);
//	cout << "删除第" << 3 << "位的结点" << endl;
//	PrintList(L->next);
//	cout << "被删除的值为" <<e<< endl;
//}
//双链表(带头结点的)
//双链表按位序插入
#include<stdio.h>
#include<iostream>
using namespace std;
typedef struct LNode {
	int data;
	struct LNode* prior, * next;
}LNode,*DLinkList;
bool InitList(DLinkList& L) {
	L = (LNode*)malloc(sizeof(LNode));
	if (L == NULL)
		return false;
	L->next = NULL;
	L->prior = NULL;
	return true;
}
//打印双链表
void PrintDLinkList(DLinkList p) {
	while (p->next != NULL) {
		cout << p->data << "<->";
		p= p->next;
	}
	cout <<p->data<< "->NULL" << endl;
}
//按指定位序插入结点
bool InsertList(DLinkList& L,int i,int e) {
	if (L == NULL)
		return false;
	LNode* p = L;
	int j = 0;
	while (p != NULL && j < i - 1) {
		p = p->next;
		j++;
	}
	if (p == NULL)
		return false;
	LNode* s = (LNode*)malloc(sizeof(LNode));
	if (s == NULL)
		return false;
	s->data = e;
	s->next = p->next;
	if (p->next != NULL)
		p->next->prior = s;
	s->prior = p;
	p->next = s;
	return true;
}
//在指定结点前面插入结点
bool InsertPriorNode(LNode*& p,int e) {
	if (p == NULL)
		return false;
	LNode* q = p->prior;
	LNode* s = (LNode*)malloc(sizeof(LNode));
	if (s == NULL)
		return false;
	s->data = e;
	s->next = p;
	p->prior = s;
	q->next = s;
	s->prior = q;
	return true;
}
//在指定位置删除结点
bool DeleteList(DLinkList& L,int i,int &e) {
	if (L == NULL)
		return false;
	LNode* p = L;
	int j = 0;
	while (p != NULL && j < i - 1) {
		p = p->next;
		j++;
	}
	if (p == NULL)
		return false;
	LNode* q = p->next;
	e = q->data;
	p->next = q->next;
	if(q->next != NULL)
		q->next->prior = p;
	free(q);
	return false;
}
//删除指定结点
bool ListDelete(LNode*& p,int& e) {
	if (p == NULL)
		return false;
	e = p->data;
	LNode* q = p->prior;
	q->next = p->next;
	if (q->next != NULL)
		p->next->prior = q;
	free(p);
	return true;
}
int main() {
	DLinkList L;
	InitList(L);
	int i = 0;
	int x = 0;
	//利用尾插法创建双链表
	LNode* r = L;
	while (i < 10) {
		cin >> x;
		LNode* s = (LNode*)malloc(sizeof(LNode));
		if (s == NULL)
			return false;
		s->data = x;
		r->next = s;
		s->prior = r;
		r = s;
		i++;
	}
	r->next = NULL;
	cout << "未修改前的双链表：" << endl;
	PrintDLinkList(L->next);
	//在指定位序插入结点
	cout << "在第" << 4 << "位插入结点后：" << endl;
	InsertList(L, 4, 780);
	PrintDLinkList(L->next);
	//在指定位序删除结点
	int e = 0;
	cout << "在第" <<6<<"位删除结点："<<endl;
	DeleteList(L,6,e);
	PrintDLinkList(L->next);
	cout << "被删除结点所存储的值为:" << e << endl;
	//在指定结点前面插入结点
	cout << "在指定结点前面插入结点:" << endl;
	LNode* p = L->next->next->next->next->next->next;
	InsertPriorNode(p,10000);
	PrintDLinkList(L->next);
	//删除指定结点
	cout << "删除指定结点p后：" << endl;
	p = L->next->next->next->next->next->next->next->next;
	p->data = 987;
	ListDelete(p,e);
	PrintDLinkList(L->next);
	cout << "被删除结点的值为：" << e << endl;
	return 0;
}
//循环链表
//循环链表-循环单链表和循环双链表
//这是一个测试





















