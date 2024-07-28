class Area
{
double r,area;
void get(double x)
{
r=x;
}
void cal()
{
area=4*3.14*r*r;
System.out.println("area of sphere="+area);
}
}
class Volume extends Area
{
double r,volume;
void get(double y)
{
r=y;
}
void cal()
{
volume=1.3*3.14*r*r;
System.out.println("volume of sphere="+volume);
}
}
class AreaVolume
{
public static void main(String arg[])
{
Volume c = new Volume();
c.get(3);
c.cal();
c.get(4);
c.cal();
}
}