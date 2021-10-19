#include<stdio.h>
#include<stdlib.h>
int n=10,a[10],top=-1;
void push(int item)
{
	if(top==n-1)
	{
		printf("Underflow");
	}
	else
	{
		top++;
		a[top]=item;
	}
}
int pop()
{
	int t=0;
	if(top==-1)
	{
		printf("Stack is empty");
	}
	else
	{
		t=a[top];
		top--;
	}
	return t;
}
int peek()
{
	if(top==-1)
	{
		printf("Stack is empty");
	}
	else
	{
		return a[top];
	}
}
void display()
{
	int i;
	for(i=0;i<=top;i++)
	{
		printf("%d\t",a[i]);
	}
}
main()
{
	int ch,item;
	while(1)
	{
		printf("\n1. For Push\n2. For Pop\n3. For Peek\n4. For display\n5. For exit");
		printf("\nEnter your choice: ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:printf("Enter the element to push: ");
				   scanf("%d",&item);
				   push(item);break;
			case 2:if(top==-1)
				   printf("Stack is already empty");
				   else
				   pop();break;
			case 3:if(top==-1)
				   printf("Stack is empty");
				   else
				   printf("Top element is %d",peek());break;
			case 4:display();
			case 5:exit(0);	   	      
		}
	}
}
