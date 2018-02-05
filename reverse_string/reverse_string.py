input = "abcdefg"
#1
output =""
for i in range(len(input)-1,-1,-1):
    output = output+input[i]

#2
#output = input[::-1]

print(output)
