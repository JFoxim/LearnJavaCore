import java.lang.String;
import java.util.Objects; 

public class EqualsHashCodeExample{ 

private static class Point{ 
  private int x = 0, y = 0;
  private String name; 

Point(int x, int y, String name){ 
    this.x = x; 
    this.y = y; 
    this.name = name;
} 

@Override
public boolean equals(Object obj){ 
    if (this == obj) 
     return true; 
  if (obj == null || !obj.getClass().equals(getClass())) 
     return false; 
 
   Point that = (Point) obj; 
   if (!Objects.equals(x, that.x)) return false; 
   if (!this.name.equals(that.name)) return false;
    return this.y == that.y;
}

@Override
public int hashCode(){ 
            int result = x; 
            result = 31* result + y + Objects.hashCode(name); 
            return result; 
        } 
}

public static void main(String[] args){ 
        Point source = new Point(10, 10, "test2"); 
        Point target = new Point(10, 10, "test2"); 
        System.out.println("Is point equals ? "+ source.equals(target)); 
        System.out.println("Is hashCode equals ? "+ (source.hashCode() == target.hashCode())); 
        System.out.println(Objects.hashCode("test2"));
        System.out.println("test2".hashCode());
    } 
} 
