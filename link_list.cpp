//#include<stdio.h>
//#include<iostream>
//using namespace std;
//����˳�������������ߵ�����ֻ������˳��洢�ķ�ʽ����������ʽ�洢�ķ�ʽ��ʾ�����Ա���һ���߼��ṹ
//��ʽ�洢���ŵ��ǲ�Ҫ������洢�ռ䣬�ı��������㣬ȱ���ǲ��������ȡ����Ҫ�ķ�һ���Ŀռ����洢ָ��
//˳��洢���ŵ��������ȡ���洢�ܶȸߣ�ȱ����Ҫ������洢�ռ䣬�ı�����������
//����ͷ�ڵ������
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = NULL;//��ֹ��������
//	return true;
//}
//int main() {
//	linklist L;
//	//��ʼ��һ���ձ�
//	InitList(L);
//}
////��ͷ�ڵ������
//typedef struct LNode {
//	int data;
//	struct LNode* next;
//}LNode,*linklist;
//bool InitList(linklist& L) {
//	L = (LNode*)malloc(sizeof(LNode));
//	if (L == NULL)	//�����ڴ�ʧ��
//		return false;
//	L->next = NULL;
//	return true;
//}
//int main() {
//	linklist L;
//	//��ʼ������
//	InitList(L);
//	//ĳЩ���ز���
//}
//��ͷ�ڵ㰴λ�����
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
//	//ĳЩ���ز���
//ListInsert(L,5,7);
//}
//��ͷ�ڵ��λ�����
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
//	//��ʼ������
//	InitList(L);
//
//}
//ָ�����ĺ�����-����������ͷ��㣬�ؼ����㷨���ֶ�����ͬ��
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
//		return false;//�ڴ����ʧ��
//	s->data = e;
//	s->next = p->next;
//	p->next = s;
//}
//int main() {
//	linklist L;
//	InitList(L);
//	//ĳЩ����
//
//	//InsertNextNode(p,5);
//
//
//}
//ָ������ǰ�����-����������ͷ��㣬�ؼ����㷨���ֶ�����ͬ��
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
//��λ��ɾ������ͷ��㣩
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
//	//ListDelete(L,i,e)ע��L��eҪ����ַ��ȥ
//}
//��λ��ɾ��������ͷ��㣩
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
// ɾ��ָ�����p
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
////^(*��(oo)��)^ע���˷�����p����һ��λΪNULL���ް취
//����֮���p�����һ����㣬��ֻ�ܴӱ�ͷ������p��ǰ����ʱ�临�Ӷ�ΪO��n��
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
//������ʵս
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
////ָ��λ��Ĳ������
//bool ListInsert(linklist& L,int i,int e) {
//	/*LNode* p = L;
//	int j = 0;
//	while (p != NULL && j < i - 1) {
//		p = p->next;
//		j++;
//	}
//	if (p == NULL)
//		return false;*/ //��װ��ȡpָ��Ĵ���
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
////ָ�����ĺ�����
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
////ɾ��ָ��λ��Ľ��
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
////��ӡ����
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
//	//β�巨
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
//ǰ�巨
// while(j<10){
// cin>>x;
// LNode* s = (LNode*)malloc(sizeof(LNode));
// s->data = x;
// s->next = L->next;
// L->next = s;
// j++;
// } 
//cout << "��������"<<endl;
//	PrintList(L->next);
//	//��ָ��λ�������
//	cout << "�ڵ�" << 5 << "λ�������" << endl;
//	ListInsert(L, 5, 98);
//	PrintList(L->next);
//	//ָ�����ĺ�����
//	LNode* p = GetElem(L,8);
//	InsertNextNode(p, 10000);
//	cout << "��ָ�����p������к�������"<<endl;
//	PrintList(L->next);
//	//ɾ��ָ��λ��Ľ��
//	int e = 0;
//	ListDelete(L, 3, e);
//	cout << "ɾ����" << 3 << "λ�Ľ��" << endl;
//	PrintList(L->next);
//	cout << "��ɾ����ֵΪ" <<e<< endl;
//}
//˫����(��ͷ����)
//˫����λ�����
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
//��ӡ˫����
void PrintDLinkList(DLinkList p) {
	while (p->next != NULL) {
		cout << p->data << "<->";
		p= p->next;
	}
	cout <<p->data<< "->NULL" << endl;
}
//��ָ��λ�������
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
//��ָ�����ǰ�������
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
//��ָ��λ��ɾ�����
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
//ɾ��ָ�����
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
	//����β�巨����˫����
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
	cout << "δ�޸�ǰ��˫����" << endl;
	PrintDLinkList(L->next);
	//��ָ��λ�������
	cout << "�ڵ�" << 4 << "λ�������" << endl;
	InsertList(L, 4, 780);
	PrintDLinkList(L->next);
	//��ָ��λ��ɾ�����
	int e = 0;
	cout << "�ڵ�" <<6<<"λɾ����㣺"<<endl;
	DeleteList(L,6,e);
	PrintDLinkList(L->next);
	cout << "��ɾ��������洢��ֵΪ:" << e << endl;
	//��ָ�����ǰ�������
	cout << "��ָ�����ǰ�������:" << endl;
	LNode* p = L->next->next->next->next->next->next;
	InsertPriorNode(p,10000);
	PrintDLinkList(L->next);
	//ɾ��ָ�����
	cout << "ɾ��ָ�����p��" << endl;
	p = L->next->next->next->next->next->next->next->next;
	p->data = 987;
	ListDelete(p,e);
	PrintDLinkList(L->next);
	cout << "��ɾ������ֵΪ��" << e << endl;
	return 0;
}
//ѭ������
//ѭ������-ѭ���������ѭ��˫����
//����һ������





















