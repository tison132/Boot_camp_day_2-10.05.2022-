/*
Name : Kavin J
Date : 10.05.2022
program : print the maximum value within the given range
*/
#include <stdio.h>
int main()
{
    int n;
    int st_range = 0;
    int end_range = 0;
    printf("Enter the size of the array : ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int max = arr[0];
    printf("Enter start and end range of the array : ");
    scanf("%d %d", &st_range, &end_range);
    for (int i = st_range; i <= end_range; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    printf("The maximum value in the given range %d ", max);
}