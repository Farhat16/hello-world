

package sortarray;

public class Sortarray {

public int[] array;

public Sortarray(int[] m){

this.arr=m;

}

public void display(){

System.out.println("\n array ");

for(int k=0;k<this.arr.length;k++)

{
System.out.print(this.arr1[k] + "  ");


}

}

public void sortaraymethd()

{

for(int k=0;k<arr.length;k++)

{

for(int f=i+1;f<arr.length;f++)

{
int temp;


if(arr[k]>arr[f])


{


    temp=arr[i];


    arr[k]=arr[f];


    arr[f]=temp;


}


}

}

}

public static void main(String[] args) {

int[] m={9,0,2,3,1,6,7,8,4,5};

Sortaray sort=new Sortaray(m);

System.out.println("\n array before sorting");

sort.display();

System.out.println("\n array after sorting");

sort.sortaraymethd();

sort.display();

}

}
