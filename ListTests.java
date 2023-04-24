//import junit for testing
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
  @Test
  public void filterTest() {
    StringChecker sc = new StringCheck("a");
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    List<String> list2 = new ArrayList<>();
    list2.add("b");
    list2.add("c");
    assertEquals(list2, ListExamples.filter(list, sc));
  }
}

class StringCheck implements StringChecker {
  String filter; 

  public StringCheck(String str) {
    filter = str;
  }

  public boolean checkString(String str) {
    if (str.contains(filter)){
      return false;
    }
    else {
      return true;
    }
  }
}