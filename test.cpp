#include <string>
#include <vector>
#include <ctime>
#include <unordered_map>
#include <stdio.h>
#include <fstream>
#define NANO 1000000000
using namespace std;
int main() {

    struct timespec ts, te;
    double cost;
    clock_gettime(CLOCK_REALTIME, &ts);

    unordered_map<string, int> map;    
    ifstream fin("inputfile.txt");
    string word;
    while(getline(fin, word)) {
        ++map[word];
    }

    clock_gettime(CLOCK_REALTIME, &te);    
    cost = te.tv_sec - ts.tv_sec + (double)(te.tv_nsec-ts.tv_nsec)/NANO;
    printf("cost: %-15.10f s\n", cost);

    return 0;
}
