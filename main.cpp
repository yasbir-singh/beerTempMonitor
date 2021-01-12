#include<bits/stdc++.h>
#include <GLUT/glut.h>
#include <unistd.h>
#define pi 3.142857
using namespace std;

float temp[5];
float bearTempMax[5], bearTempMin[5];

float* getInput(int t){
    cout << t << "\n";
    std::fstream myfile("data.txt", std::ios_base::in);

    for(int i=0; i<5*t; i++){
        myfile >> temp[i];
    }
    for(int i=0; i<5; i++){
        myfile >> temp[i];
    }
    
    return temp;
}

//float* getInput(){
//    for(int i=0; i<5; i++){
//        temp[i] = bearTempMin[i]-1 + static_cast <float> (rand()) /( static_cast <float> (RAND_MAX/(bearTempMax[i]+1-bearTempMin[i]+1)));
//    }
//    return temp;
//}

int main(int argc, char** argv){
    srand (static_cast <unsigned> (time(0)));
    
    
    cout << "Temperature Monitor" << "\n";
    // initializing minimum and maximum temperature of bear
    bearTempMax[0] = 6.0; bearTempMin[0] = 4.0;
    bearTempMax[1] = 6.0; bearTempMin[1] = 5.0;
    bearTempMax[2] = 7.0; bearTempMin[2] = 4.0;
    bearTempMax[3] = 8.0; bearTempMin[3] = 6.0;
    bearTempMax[4] = 5.0; bearTempMin[4] = 3.0;
    
    int t=0;
    while(t<5){
        float* input;
        input = getInput(t);
        for(int i=0; i<5; i++){
            if(*(input+i)>=bearTempMin[i] && *(input+i)<=bearTempMax[i]){
                cout << "Container  " << i+1 << "  is under control and have temp: " << *(input+i) << "\n";
            } else {
                cout << "WARNING:  Container  " << i+1 << "  is out of control and have temp: " << *(input+i) << "\n";
            }
        }
        cout << "\n" << "\n";
        sleep(3);
        t++;
    }
}
