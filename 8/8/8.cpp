#define _CRT_SECURE_NO_WARNINGS
#include <iostream>  
#include <sstream>  
#include <set>  
#include <string>  
#include <cctype> // 用于std::isspace  

int main() {
    std::string lineA, lineB;
    // 读取两行输入，分别表示集合A和集合B的元素（包含大括号）  
    std::getline(std::cin, lineA);
    std::getline(std::cin, lineB);

    // 去除大括号，并处理字符串  
    lineA = lineA.substr(1, lineA.size() - 2); // 去除开头和结尾的大括号  
    lineB = lineB.substr(1, lineB.size() - 2);

    // 去除字符串两端的空格（如果有的话）  
    lineA.erase(0, lineA.find_first_not_of(" "));
    lineA.erase(lineA.find_last_not_of(" ") + 1);
    lineB.erase(0, lineB.find_first_not_of(" "));
    lineB.erase(lineB.find_last_not_of(" ") + 1);

    // 将字符串按逗号分割成元素，并存储到set中  
    std::set<std::string> setA, setB;
    std::istringstream issA(lineA), issB(lineB);
    std::string element;
    while (std::getline(issA, element, ',')) {
        // 去除元素两端的空格（如果有的话）  
        element.erase(0, element.find_first_not_of(" "));
        element.erase(element.find_last_not_of(" ") + 1);
        setA.insert(element);
    }
    while (std::getline(issB, element, ',')) {
        element.erase(0, element.find_first_not_of(" "));
        element.erase(element.find_last_not_of(" ") + 1);
        setB.insert(element);
    }

    // 检查集合A是否是集合B的子集  
    bool isSubset = true;
    for (const auto& elem : setA) {
        if (setB.find(elem) == setB.end()) {
            isSubset = false;
            break;
        }
    }

    // 输出结果  
    if (isSubset) {
        std::cout << "Yes" << std::endl;
    }
    else {
        std::cout << "No" << std::endl;
    }

    return 0;
}

