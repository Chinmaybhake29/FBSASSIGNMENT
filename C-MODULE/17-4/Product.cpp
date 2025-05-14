#include<stdio.h>
#include<string.h>

struct Product
{
	int id;
	char name[20];
	int quantity;
	int price;
};
Product storeproduct()
{
	Product p;
	printf("Enter the deatails of product ");
	scanf("%d",&p.id);
	scanf("%s",&p.name);
	scanf("%d",&p.price);
	scanf("%d",&p.quantity);	
	return p;
}
void display(Product p1)
{
	printf("Id: %d\n",p1.id);
	printf("Name: %s\n",p1.name);
	printf("Price: %d\n",p1.price);
	printf("Quantity: %d\n",p1.quantity);
}
int main()
{
	Product p1,p2,p3;
	
	p1=storeproduct();
	display(p1);
	
	p2=storeproduct();
	display(p2);
	
	p3=storeproduct();
	display(p3);
}
