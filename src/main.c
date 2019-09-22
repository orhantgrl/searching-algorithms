#include <stdio.h>
#include <stdlib.h>
#include "../include/linear-search.h"

#define ARRAY_LENGHT(x) (sizeof(x) / sizeof((x)[0])) //Some special useful things :)

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void select_search_algorithm(int _array, int _array_size, int input);

int main(int argc, char *argv[])
{
	int input, _array[] = {2, 3, 5, 6, 9, 12, 32, 54, 74, 111};
	int _array_size = ARRAY_LENGHT(_array);
	
	select_search_algorithm(_array, _array_size, input);
	
	system("PAUSE");
	return 0;
}

void select_search_algorithm(int _array, int _array_size, int input)
{
	int choosen_search = 0;
	
	printf("----------------------------------------\n");
	printf("Aramak istediginiz input degerini girin: ");
	scanf("%d" ,&input);
	
	printf("----------------------------------------\n");
	printf("1. Linear Arama(Dogrusal Arama)\n2. Binary Arama(Ikili Arama)\n");
	
	printf("Arama turunu secin: ");
	scanf("%d" ,&choosen_search);
	
	/**
	* Not: Karisik bir dizi içerisinde arama islemi yapilacaksa, 
	* dogrusal arama algoritmasi her zaman icin en basit ve hizli algoritmadir.
	*/
	switch(choosen_search){
		case 1 :
			run_linear_search(_array, _array_size, input);
			break;
		case 2:
			run_binary_search(_array, _array_size, input);
			break;
		default:
			printf("You better watch your mouth :Kappa:");
			break;
				
	}
}
