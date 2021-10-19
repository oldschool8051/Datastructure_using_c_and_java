import java.util.*;
class stack
{
    int a[],n;
    static int top=-1;
    stack(int size)
    {
        n=size;
        a=new int[n];
    }
    void push(int item)
    {
        if(top==n-1)
        {
            System.out.println("stack is Overflow");
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
            System.out.println("Stack is empty");
        }
        else{
        t=a[top];
        top--;}
        return t;
    }
    void peek()
    {
        if(top==-1)
        System.out.println("Stack is empty");
        else
        System.out.println("Top element is: "+a[top]);
    }
    void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
public class stack_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        stack ob =new stack(n);
        int choice=0;
        while(choice!=5)
        {
            System.out.print("\n1. For Push\n2. For Pop\n3. For Peek\n4. For display\n5. For exit");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.print("Enter the element to push: ");
				       int item=sc.nextInt();
				       ob.push(item);break;
			    case 2:if(stack.top==-1)
				       System.out.print("Stack is already empty");
				       else
				       ob.pop();break;
			    case 3:if(stack.top==-1)
				       System.out.print("Stack is empty");
				       else
				       ob.peek();break;
			    case 4:ob.display();break;
			    case 5:System.exit(0);
            }
        }
    }
}