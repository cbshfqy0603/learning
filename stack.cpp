//顺序栈
//讨论一个数据结构，首先就要分析它的三个方面：（1）逻辑结构（2）运算-就是基本操作（3）存储结构
//运算：创，销，增，删，查
#include<iostream>
using namespace std;
#define maxsize 10
typedef struct {
	int data[maxsize];
	int top;
}SqStack;
//初始化顺序栈
void InitStack(SqStack& s) {
	s.top = -1;
}
//判断栈是否为空
bool IsEmpty(SqStack s) {
	if (s.top == -1) {
		cout << "栈为空" << endl;
		return true;
	}
	else {
		cout << "栈不为空" << endl;
		return false;
	}
}
//进栈-就是逻辑上的进栈而不是物理意义上的
bool Push(SqStack& s,int e) {
	if (s.top == maxsize - 1)
		return false;
	//这两步可直接简化为
	//s.data[++s.top] = e;
	s.top = s.top + 1;
	s.data[s.top] = e;
	return true;
}
//出栈-同样也只是逻辑上的
bool Pop(SqStack& s,int& e) {
	if (s.top == -1)
		return false;
	//同理可简化
	//e = s.data[s.top--];
	e = s.data[s.top];
	s.top = s.top - 1;
	return true;
}
//读栈顶元素
bool GetTop(SqStack s,int& e) {
	if (s.top == -1)
		return false;
	e = s.data[s.top];
	return true;
}
//打印栈
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
	cout << "未出栈前："<<endl;
	PrintStack(s);
	cout << "出栈操作后："<<endl;
	int e = 0;
	Pop(s,e);
	PrintStack(s);
	GetTop(s, e);
	cout << "此时栈顶的元素为："<< e << endl;
	return 0;
}
//补充说明：此处将top指针初始化为-1，也可将初始指针初始化为0,此时要注意push操作中的s.data[++s.top]=e就
// 变为了s.data[s.top++]=e,同理pop操作中的e=s.data[s.top--]变为e=s.data[--s.top]
//共享栈
