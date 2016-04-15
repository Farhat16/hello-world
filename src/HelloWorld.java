public cpackage mystackproject;

public class Mystack {

public int[] sk=new int[10]; 

public int top;

public Mystack(){
    this.top=-1;
}

public boolean isFull(){
    if(this.top==10-1) {
        return true;
    }
    else {
        return false;
    }
}
public boolean isEmpty(){
    if(this.top==-1) 
    {
        return true;
    }
    else 
    {
        return false;
    }
}
public void push(int m)
{
    if(isFull()==true) 
	
	
    {
        System.out.println("stack is full");
    }
    else
    {
        this.top=this.top+1;
        sk[this.top]=m;
    }
}
public void display(){
    if(isEmpty()==true)
    {
        System.out.println("stack is empty");
    }
    else
    {
        System.out.println("\ndisplay the stack elements:");
        for(int j=this.top;j>=0;j--) {
            System.out.print(sk[j] + " ");

        }
        System.out.println();
    }
}
public int pop(){
    int m = 0;
    if(isEmpty()==true)
    {
        System.out.print("stack is empty, not possible to pop any element");
    }
    else
    {
        System.out.print("pop element=");
        m=this.sk[this.top];
        this.top=this.top-1;
        System.out.print(m + " ");

    }
    return m;
}
public static void main(String[] args)
{
    Mystack skObj=new Mystack();
    skObj.push(45);
    skObj.push(24);
    skObj.push(34);
    skObj.display();
    skObj.pop();
    skObj.display();
}
}
