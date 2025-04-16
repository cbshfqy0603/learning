#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<string>
using namespace std;
//实例一：现有5只小猪，其体重储存在数组中arr[]={200,1000,800,1500,2000},找出体重最大的小猪
//int main() {
//	int arr[] = {200,1000,800,1500,150};
//	int temp = 0;
//	for (int i = 0; i < 5; i++) {
//		if (arr[i] > temp)
//			temp = arr[i];
//	}
//	cout << "最重的小猪的体重为:" << temp << endl;
//    system("pause");
//	return 0;
//}
//实例二：数组元素的倒置
//void print(int arr[],int n) {
//	for(int i =0;i<n;i++)
//	cout << arr[i] << endl;
//}
//int main() {
//	int arr[] = {1,2,3,4,5,6,7,8,9};
// int n = sizeof(arr) / sizeof(arr[0]);
//	cout << "倒置数组前：" << endl;
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
//	cout << "倒置数组后：" << endl;
//	print(arr,n);
//
//	return 0;
//}
//实例三：冒泡排序
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
//	cout << "排序前：" << endl;
//	print(arr,n);
//    Bubble_sort(arr,n);
//	cout << "排序后：" << endl;
//	print(arr,n);
//
//    return 0;
//}
//知识点：二维数组
//一.二维数组的创建：一个一个赋值的创建方法略
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
//实例：考试成绩统计
//int main() {
//	int arr[3][3] = {
//		{100,100,90},
//	    {90,80,30},
//	    {50,40,30}
//	};
//	string name[] = {"张三","李四","王五"};
//	for (int i = 0; i < 3; i++) {
//		int sum = 0;
//		for (int j = 0; j < 3; j++) {
//			 sum+=arr[i][j];
//		}
//		cout << name[i]<<"的成绩为："<<sum<< endl;	
//	}
//	return 0;
//}
//二.二维数组名称的运用
	//（1）
	/*cout << "二维数组的地址为：" << arr << endl;
	cout << "第一行的地址为：" << arr[0] << endl;
	cout << "第二行的地址为：" << arr[1] << endl;
	cout << "第一行第一个元素的地址为：" << arr[0][0] << endl;
	return 0;
}*/
	//如果要计算行数直接用多维数组所占的内存除以多元数组某一行所占的即可 求列用某一行所占的内存直接除以一个元素所占的内存即可
//示例四：换针问题
	//将src针的最上面一个盘子移动到dest针上
	//void move(char src,char dest)
	//{
	//	cout << src << " --> " << dest << endl;
	//}
	////将n个盘子从src针移动到dest针，以medium针作为中转
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
//实例五：递归求阶乘
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
//	cout << "请输入一个数字:";
//	cin >> num;
//	cout << endl;
//	cout << Leo(num) << endl;
//	return 0;
//}
// 实例六：冒泡排序
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
//		cout << "进行冒泡排序前："<<endl;
//			print(arr,n);
//			cout << "进行冒泡排序后：" << endl;
//			Bubble_sort(arr,n);
//			print(arr,n);
//			return 0;
//	}
//实例七：插入排序
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
//	cout << "调换位置前："<<endl;
//	daying(arr1,len);
//	cout << "调换位置后：" << endl;
//	insert_sort(arr1, len);
//	daying(arr1,len);
//    return 0;
//}
//实例八：希尔排序（插入排序puls版）//有问题
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
//		cout << "进行希尔排序前："<<endl;
//		print(arr,length);
//		shell_sort(arr,length);
//		cout << "进行希尔排序后：" << endl;
//		print(arr,length);
//}
//知识点；指针
//定义指针
//int main() {
	//int a = 10;
	//int* p = &a;//指针的定义
	//cout << "指针p的值为：" << p << endl;
	//cout << "a的地址为：" << & a << endl;
	//*p = 1000;//指针的解引用
	//cout << "a的值为：" << a << endl;
	//cout << "*p的值为：" <<*p << endl;
	//指针所占内存空间的大小 指针也是一种数据类型
	/*cout<<sizeof(int*)<<endl;
	cout << sizeof(char*) << endl;
	cout << sizeof(float*) << endl;
	cout << sizeof(int*) << endl;
	cout << sizeof(long long*) << endl;
	cout << sizeof(short*) << endl;*/
	//在32位操作系统下指针变量所占的内存大小都为4 在64位操作系统下指针变量所占的大小均为8
	//野指针和空指针
    //int* p = NULL;  //空指针用于对指针变量进行初始化 但是必须注意不能对空指针所指向的内存空间进行访问
	//*p = 2000;该操作是不被允许的
	//int* p = (int*)0x1000;  指针变量指向非法的内存空间 在程序的编写过程中一定要避免野指针的出现

    // return 0;
//}


























































































