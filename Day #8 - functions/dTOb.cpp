#include<bits/stdc++.h>
#define ll long long
#define dd double
#define ff float
#define u_map unordered_map
#define u_set unordered_set
#define lb lower_bound
#define up upper_bound
#define nl "\n"
using namespace std;

void toBinary(int num) {
    vector<int> binary;
    while(num) {
        int remainder = num%2;
        binary.push_back(remainder);
        num/=2;
    }

    reverse(binary.begin(), binary.end());
    for(auto i:binary) cout << i;
}

int main()
{
    int decimal;
    cin >> decimal;
    toBinary(decimal);            
    return 0;
}