/*
Name : Kavin J
Date : 10.05.2022
program : remove the boundary of the 2d array
*/
#include <stdio.h>

int main()
{
    int n = 0;
    int m = 0;
    printf("Enter the value of m and n : ");
    scanf("%d %d", &m, &n);
    int arr[m][n];
    printf("Enter the value of the array: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    for (int i = 1; i < m - 1; i++)
    {
        for (int j = 1; j < n - 1; j++)
        {
            printf("%d   ", arr[i][j]);
        }
        printf("\n");
    }
}