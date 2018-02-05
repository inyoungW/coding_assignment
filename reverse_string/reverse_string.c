#include <stdio.h>
#include <string.h>

int main(int argc, char* argv[]) {
	int i=0,j=0;
	char input[] = "abcdefghi";
	
	int input_len = strlen(input);
	char output[sizeof(input)]=""; 
	//1
	for(i=input_len-1;i>=(input_len)/2;i--,j++){
		output[j]=input[i];
		output[i]=input[j];
	}

	printf("%s", output);
	return 0;
}
