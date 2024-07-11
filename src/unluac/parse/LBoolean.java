package unluac.parse;

public class LBoolean extends LObject {

  public static final LBoolean LTRUE = new LBoolean(true);
  public static final LBoolean LFALSE = new LBoolean(false); 
  
  private final boolean value;
  
  private LBoolean(boolean value) {
    this.value = value;
  }
  
  public boolean value() {
    return value;
  }
  
  @Override
  public String toPrintString(int flags) {
    return Boolean.toString(value);
  }
  
  @Override
  public boolean equals(Object o) {
    return this == o;
  }
  
}
