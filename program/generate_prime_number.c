/*
Name : Kavin J
Date : 10.05.2022
program : print the number within the given
*/
#include <stdio.h>
int main()
{
    int num[100];
    for (int i = 0; i < 100; i++)
    {
        num[i] = i + 1;
    }
    for (int i = 1; i < 100; i++)
    {
        if (num[i] != 0)
        {
            for (int j = i + 1; j < 100; j++)
            {
                if (num[j] % num[i] == 0)
                {
                    num[j] = 0;
                }
            }
        }
    }
    for (int i = 1; i < 100; i++)
    {
        if (num[i] != 0)
        {
            printf("%d ", num[i]);
        }
    }
}