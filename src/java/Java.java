package java;

public class Java 
{
  public static String getVolume(String value)
  {
    String part[] = value.split(":");    
    return part[2].replace("%", "");
  }
  
  public static void main(String[] args) 
  {
  }
}
