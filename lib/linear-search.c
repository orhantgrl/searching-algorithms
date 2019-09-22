#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include "../include/linear-search.h"

void run_linear_search(int _array[], int _array_size, int input)
{
    int i, j = 0;
    bool exit_flag = false;
    
    for(i = 0; i < _array_size ; i++){
        if(input == _array[i]){
            j++;
            exit_flag = true;
        }
    }
    
    if(!exit_flag){
    	printf("Aranan input degeri bulunamadi");
    	return;
	}
	printf("\nAradiginiz input degerinden (%d) listede %d tane var.\n", input, j);
}
