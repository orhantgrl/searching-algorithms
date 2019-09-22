#include <stdlib.h>
#include <stdbool.h>

void run_binary_search(int _array[], int _array_size, int input)
{
	int max_num = _array_size;
	int min_num = -1;
	bool exit_flag = false;
	
	while(max_num - min_num > 1)
	{
		int point = (max_num + min_num) / 2;
		
		printf("%d" ,_array[point]);
		if(_array[point] == input){
			printf("\nAradiginiz input degerinden (%d) listede tane var.\n", input);
			exit_flag == true;
			break;
		}else if (_array[point] < input){
			min_num = input;
		}else {
			max_num = input;
		}
	}
	
	if(!exit_flag){
		printf("\nAranan input degeri bulunamadi");
	}
}
