/**
 * @(#)SerializedObject.java
 *
 *
 * @author 
 * @version 1.00 2009/7/15
 */
import java.io.Serializable;

public class SerializedObject implements Serializable {
   private int number;
   private String username;
   private transient String password;
   public SerializedObject(int number) {
      this.number = number;
   }
 
   public int getNumber() {
      return number;
   }
}
