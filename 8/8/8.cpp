#define _CRT_SECURE_NO_WARNINGS
#include <iostream>  
#include <sstream>  
#include <set>  
#include <string>  
#include <cctype> // ����std::isspace  

int main() {
    std::string lineA, lineB;
    // ��ȡ�������룬�ֱ��ʾ����A�ͼ���B��Ԫ�أ����������ţ�  
    std::getline(std::cin, lineA);
    std::getline(std::cin, lineB);

    // ȥ�������ţ��������ַ���  
    lineA = lineA.substr(1, lineA.size() - 2); // ȥ����ͷ�ͽ�β�Ĵ�����  
    lineB = lineB.substr(1, lineB.size() - 2);

    // ȥ���ַ������˵Ŀո�����еĻ���  
    lineA.erase(0, lineA.find_first_not_of(" "));
    lineA.erase(lineA.find_last_not_of(" ") + 1);
    lineB.erase(0, lineB.find_first_not_of(" "));
    lineB.erase(lineB.find_last_not_of(" ") + 1);

    // ���ַ��������ŷָ��Ԫ�أ����洢��set��  
    std::set<std::string> setA, setB;
    std::istringstream issA(lineA), issB(lineB);
    std::string element;
    while (std::getline(issA, element, ',')) {
        // ȥ��Ԫ�����˵Ŀո�����еĻ���  
        element.erase(0, element.find_first_not_of(" "));
        element.erase(element.find_last_not_of(" ") + 1);
        setA.insert(element);
    }
    while (std::getline(issB, element, ',')) {
        element.erase(0, element.find_first_not_of(" "));
        element.erase(element.find_last_not_of(" ") + 1);
        setB.insert(element);
    }

    // ��鼯��A�Ƿ��Ǽ���B���Ӽ�  
    bool isSubset = true;
    for (const auto& elem : setA) {
        if (setB.find(elem) == setB.end()) {
            isSubset = false;
            break;
        }
    }

    // ������  
    if (isSubset) {
        std::cout << "Yes" << std::endl;
    }
    else {
        std::cout << "No" << std::endl;
    }

    return 0;
}

