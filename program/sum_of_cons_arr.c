/*
Name : Kavin J
Date : 10.05.2022
program : sum of the adjacent value in the array
*/
#include <stdio.h>
void sum_cons(int arr[], int n)
{
    int v = 0;
    if (n % 2 != 0)
    {
        v = 1;
    }
    for (int i = n - 1; i >= v; i = i - 2)
    {
        printf("%d ", arr[i] + arr[i - 1]);
    }
    if (n % 2 != 0)
    {
        printf("%d", arr[0]);
    }
}
int main()
{
    int n = 0;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    printf("Enter the array: ");
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    sum_cons(arr, n);
}