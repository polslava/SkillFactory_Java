public class Bell {
    int status = 0;
public String sound()
{
String result ="";
    //System.out.println("status0: "+status);
    if (status <2)
    {
        status=status+1;
    } else
    {
        status =1;}
    //System.out.println("status: "+status);
switch (status)
{
    case 1: result= "ding";
        break;
    case 2: result= "dong";
        break;
}
    //System.out.println("result "+result);

    return result;

}

}