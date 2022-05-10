/*
Name : Kavin J
Date : 10.05.2022
program : print the number of times the key value present in the array
*/
#include <stdio.h>
void check(int arr[], int key, int n)
{
    int flag = 0, count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            flag = 1;
            count++;
        }
    }
    if (flag==1)
    {
        printf("Element present the array\n");
        printf("Elements present %d times", count);
    }
    else
    {
        printf("Element not present in the array");
    }
}
int main()
{
    int arr[25];
    int key = 0;
    int n = 25;
    printf("Enter the value of the array: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter the element to be searched : \n");
    scanf("%d", &key);
    check(arr, key, n);
}