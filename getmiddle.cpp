#include <iostream>
#include <string>
#include <sstream>
using namespace std;


std::string get_middle(std::string input)
{
	if (input.length() % 2 == 0) {
		
		stringstream ss;
		string s;
		ss << input[input.length() / 2] + input[(input.length() / 2) + 1];
		ss >> s;
		return s;
	}
	else {
		stringstream ss;
		string s;
		ss<<input[input.length() / 2];
		ss >> s;
		return s;
	}
}


int main() {
	//cout << get_middle("test");
	string input = "test";
	stringstream ss;
	string s;
	ss << input[input.length() / 2] + input[(input.length() / 2) + 1];
	ss >> s;
	cout << s;
	system("pause");
	return 0;
}