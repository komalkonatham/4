class Book {
// write your code here...
}
public class BookTest {
// write your code here...
}
*/
import java.util.Scanner;
public class BookTest{
String bookName,isbn,authorName,publisher;
static Scanner sc=new Scanner(System.in);
BookTest(){
System.out.print("Book Name: ");
bookName=sc.nextLine();
System.out.print("ISBN: ");
isbn=sc.nextLine();
System.out.print("Author Name: ");
authorName=sc.nextLine();
System.out.print("Publisher: ");
publisher=sc.nextLine();
}
public void getBookInfo(){
System.out.println("Book Name: "+bookName);
System.out.println("ISBN: "+isbn);
System.out.println("Author Name: "+authorName);
System.out.println("Publisher: "+publisher);
}
public static void main(String[] args){
System.out.print("Number of books (N): ");
String N=sc.nextLine();
int n =Integer.parseInt(N);
BookTest[] obj=new BookTest[n];
for(int i=1;i<=n;i++){
System.out.printf("Details for Book %d:\n",i);
obj[i-1]=new BookTest();
}
for(int i=1;i<=n;i++){
System.out.printf("Book %d Information:\n",i);
obj[i-1].getBookInfo();
}
}
}
E
