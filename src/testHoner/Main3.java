//package testHoner;
//
//public class Main3 {
//}
//
//#include <stdio.h>
//        #include <iostream>
//#include <math.h>
//        #include <string>
//#include <limits.h>
//        #include <queue>
//#include <stack>
//#include <algorithm>
//#include <vector>
//#include <map>
//
//
//using namespace std;
//
//
//
//        vector<int> getInput(){
//        string s;
//        cin>>s;
//        int sum = 0;
//        s=s+",";
//        vector<int> input;
//        for(int i = 0;i<s.size();i++){
//        if(s[i] != ','){
//        sum=sum*10+(s[i] - '0');
//        }else{
//        input.push_back(sum);
//        sum =0;
//        }
//        }
//        return input;
//        }
//
//        bool compare(vector<int> a, vector<int> b){
//        if(a[0] != b[0]){
//        return a[0]<b[0];
//
//        }
//        else{
//        return a[1]<b[1];
//        }
//        }
//
//
//        int main(){
//        vector<int> s = getInput();
//        vector<int> len = getInput();
//        vector<int> light = getInput();
//        vector<int> level = getInput();
//
//        int n = len.size();
//
//        vector<vector<int>> ans (n, vector<int>(3,0));
//        int minTime = INT_MAX, q, res;
//        for(int i = 0; i<n; i++){
//        ans[i][0] =(len[i])*1.0/2 + (s[i]-len[i])*1.0/10 + light[i]*15;
//        ans[i][1] = level[i];
//        ans[i][2] = i;
//        if(ans[i][0]<minTime){
//        minTime=ans[i][0];
//        q=ans[i][1];
//        res = ans[i][2];
//        }
//        }
//        sort(ans.begin(), ans.end(),compare);
//        int res_time = minTime;
//        for(long long int i = 1; i<n; i++){
//        if(ans[i][0] < minTime +60){
//        if(ans[i][1]> q){
//        res_time = ans[i][0];
//        res = ans[i][2];
//        q = ans[i][1];
//        }
//
//        }else{
//        break;
//        }
//        }
//        cout << res + 1<< ","<<res_time<<endl;
//
//        }
