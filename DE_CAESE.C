#include<stdio.h>
void main()
{
     char m[100],ch;
     int i,key;

     printf("Enter message");
     gets(m);

     printf("Enter Key");
     scanf("%d",&key);

     for(i=0;m[i]!='\0';++i)
     {
     ch=m[i];
     if(ch>='a'&& ch<='z')
     {
	ch=ch-key;
	if(ch<'a')
	{
		ch=ch+'z'-'a'+1;

	}
	m[i]=ch;
     }
     else if(ch>='A' && ch<='Z')
     {
	ch=ch-key;
	if(ch<'A')
	{
		ch=ch+'Z'-'A'+1;

	}
	m[i]=ch;
     }
     }
     printf("encrypted message is %s",m);
     getch();

}