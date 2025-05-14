#include<stdio.h>
#include<string.h>
//Book ID, Book Name, Author Name, Category, Price, and Rating.
struct Book
{
	int book_id;
	char book_name[100];
	char book_author_name[100];
	char book_category[100];
	float price;
	float rating;
};


struct Book b[100];
int count=1;

void hardcodedbook()
{
	b[0].book_id=1;
	strcpy(b[0].book_name, "C_Programming");
	strcpy(b[0].book_author_name, "Dennis_Ritchie");
	strcpy(b[0].book_category, "Programming");
	b[0].price=678.00;
	b[0].rating=5;	
}
void addBook()
{
	int n;
	
	printf("How many Books you want add: ");
	scanf("%d",&n);	
	
	for(int i=count;i<count+n;i++)
	{
		printf("Enter the Books Details: %d\n",i+1);
		
		printf("Book id: ");
		scanf("%d",&b[i].book_id);
		
		printf("Book Title: ");
		scanf("%s",b[i].book_name);
		
		printf("Book Author name: ");
		scanf("%s",b[i].book_author_name);
		
		printf("Category: ");
		scanf("%s",b[i].book_category);
		
		printf("Book Price: ");
		scanf("%f",&b[i].price);
		
		printf("Ratings: ");
		scanf("%f",&b[i].rating);
	}
	printf("Book Added!\n");
}
void showBooks()
{
	for(int i=0;i<count;i++)
	{
		printf("\n\n Book ID: %d | Book Name: %s | Author Name: %s | Category: %s | Price: %f | Ratings: %f\n",b[i].book_id, b[i].book_name, b[i].book_author_name, b[i].book_category, b[i].price, b[i].rating); //Book ID, Book Name, Author Name, Category, Price, and Rating.
	}
}
void search()
{
	int id, found=0;
	printf("\n Enter Book Id Search: ");
	scanf("%d",&id);
	
	for(int i=0;i<count;i++)
	{
		if(b[i].book_id == id)
		{
		  printf("\n\n Book ID: %d | Book Name: %s | Author Name: %s | Category: %s | Price: %f | Ratings: %f\n",b[i].book_id, b[i].book_name, b[i].book_author_name, b[i].book_category, b[i].price, b[i].rating); //Book ID, Book Name, Author Name, Category, Price, and Rating.
		  found=1;
		  break;
		}
	}
	if(!found)
	{
		printf("\n Book Not Found \n");
	}
	
}
void Category()
{
	char category[30];
	int found=0;
	
	printf("Enter the category: ");
	scanf("%s",category);
	
	for(int i=0;i<count;i++)
	{
		if(b[i].book_category==category)
		{
			printf("\n\n Book Category: %s | Book ID: %d | Author Name: %s | ", b[i].book_category, b[i].book_id, b[i].book_author_name);
			found=1;
			break;		
		}
	}
}
void removebook()
{
	int id, found=0;
	
	printf("\n Enter Book Id: ");
	scanf("%d",&id);
	
	for(int i=0;i<count;i++)
	{
		if(b[i].book_id == id)
		{
			for(int j=i;j<count-1;j++)
			{
				b[j]=b[j+1];
			}
			count--;
			printf("Book Deleted Successfully");
			found=1;
			break;	
		}	
	}	
	if(!found)
	{
		printf("\n Not found \n");
	}
}
int main()
{
	hardcodedbook();
	printf("\n------------------------------------");
	printf("\n Book Management System: \n");
	printf("------------------------------------");

	int n;
	do
	{
		printf("\n 1. Add Books \n 2. Display Book \n 3. Search Book \n 4. Authors Book \n 5. Categorys Book \n 6. Upadte Book \n 7. Delete Books");
		
		
		printf("\n\n Enter Your Choice: ");
		scanf("%d",&n);
	
		switch(n)
		{
			case 1: addBook();
				break;
			case 2: showBooks();
				break;
			case 3: search();
				break;
			case 5: Category();
				break;
			case 7: removebook();
				break;
			default: printf("Sorry! We Haven't More Service");
		}
	} while(n!=0);
}
