//˳��ջ
//����һ�����ݽṹ�����Ⱦ�Ҫ���������������棺��1���߼��ṹ��2������-���ǻ���������3���洢�ṹ
//���㣺������������ɾ����
#include<iostream>
using namespace std;
#define maxsize 10
typedef struct {
	int data[maxsize];
	int top;
}SqStack;
//��ʼ��˳��ջ
void InitStack(SqStack& s) {
	s.top = -1;
}
//�ж�ջ�Ƿ�Ϊ��
bool IsEmpty(SqStack s) {
	if (s.top == -1) {
		cout << "ջΪ��" << endl;
		return true;
	}
	else {
		cout << "ջ��Ϊ��" << endl;
		return false;
	}
}
//��ջ-�����߼��ϵĽ�ջ���������������ϵ�
bool Push(SqStack& s,int e) {
	if (s.top == maxsize - 1)
		return false;
	//��������ֱ�Ӽ�Ϊ
	//s.data[++s.top] = e;
	s.top = s.top + 1;
	s.data[s.top] = e;
	return true;
}
//��ջ-ͬ��Ҳֻ���߼��ϵ�
bool Pop(SqStack& s,int& e) {
	if (s.top == -1)
		return false;
	//ͬ��ɼ�
	//e = s.data[s.top--];
	e = s.data[s.top];
	s.top = s.top - 1;
	return true;
}
//��ջ��Ԫ��
bool GetTop(SqStack s,int& e) {
	if (s.top == -1)
		return false;
	e = s.data[s.top];
	return true;
}
//��ӡջ
void PrintStack(SqStack s) {
	if (s.top == -1)
		cout << "NULL" << endl;
	while (s.top != -1) {
		cout << s.data[s.top--] << " " ;
	}
	cout << endl;
}
int main() {
	SqStack s;
	InitStack(s);
	int x = 0;
	for (int j = 0; j < maxsize; j++) {
		cin >> x;
		Push(s,x);
	}
	cout << "δ��ջǰ��"<<endl;
	PrintStack(s);
	cout << "��ջ������"<<endl;
	int e = 0;
	Pop(s,e);
	PrintStack(s);
	GetTop(s, e);
	cout << "��ʱջ����Ԫ��Ϊ��"<< e << endl;
	return 0;
}
//����˵�����˴���topָ���ʼ��Ϊ-1��Ҳ�ɽ���ʼָ���ʼ��Ϊ0,��ʱҪע��push�����е�s.data[++s.top]=e��
// ��Ϊ��s.data[s.top++]=e,ͬ��pop�����е�e=s.data[s.top--]��Ϊe=s.data[--s.top]
//����ջ
