class Score
{
int a,b,c,d,e,f;
void get()
{
a=90;
b=89;
c=88;
d=92;
e=88;
f=95;
}
}
class Grade extends Score
{
double aggregate,total;
void disp()
{
total=a+b+c+d+e+f;
aggregate =((double)total/600)*100;
if(aggregate>75)
{
System.out.println(" the grade is distinction");
}
else if(aggregate>=60)
{
System.out.println(" the grade is first division");
}
else if(aggregate>=50)
{
System.out.println(" the grade is second division");
}
else if(aggregate>=40)
{
System.out.println(" the grade is third division");
}
else
{
System.out.println(" the grade is fail");
}
}
}
class ScoreGrade
{
public static void main(String arg[])
{

Grade c=new Grade();
c.get();
c.disp();
}
}

