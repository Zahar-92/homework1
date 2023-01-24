public class One {
    private byte byteOne;
    private short shortOne;
    private int intOne;
    private long longOne;
    private float floatOne;
    private double doubleOne;
    private char charOne;
    private boolean booleanOne;

    private Byte byte2One;
    private Short short2One;
    private Integer int2One;
    private Long long2One;
    private Float float2One;
    private Double double2One;
    private Character char2One;
    private Boolean boolean2One;

    public byte getByteOne() {
        return byteOne;
    }

    public void setByteOne(byte byteOne) {
        this.byteOne = byteOne;
    }

    public short getShortOne() {
        return shortOne;
    }

    public void setShortOne(short shortOne) {
        this.shortOne = shortOne;
    }

    public int getIntOne() {
        return intOne;
    }

    public void setIntOne(int intOne) {
        this.intOne = intOne;
    }

    public long getLongOne() {
        return longOne;
    }

    public void setLongOne(long longOne) {
        this.longOne = longOne;
    }

    public float getFloatOne() {
        return floatOne;
    }

    public void setFloatOne(float floatOne) {
        this.floatOne = floatOne;
    }

    public double getDoubleOne() {
        return doubleOne;
    }

    public void setDoubleOne(double doubleOne) {
        this.doubleOne = doubleOne;
    }

    public char getCharOne() {
        return charOne;
    }

    public void setCharOne(char charOne) {
        this.charOne = charOne;
    }

    public boolean isBooleanOne() {
        return booleanOne;
    }

    public void setBooleanOne(boolean booleanOne) {
        this.booleanOne = booleanOne;
    }

    public Byte getByte2One() {
        return byte2One;
    }

    public void setByte2One(Byte byte2One) {
        this.byte2One = byte2One;
    }

    public Short getShort2One() {
        return short2One;
    }

    public void setShort2One(Short short2One) {
        this.short2One = short2One;
    }

    public Integer getInt2One() {
        return int2One;
    }

    public void setInt2One(Integer int2One) {
        this.int2One = int2One;
    }

    public Long getLong2One() {
        return long2One;
    }

    public void setLong2One(Long long2One) {
        this.long2One = long2One;
    }

    public Float getFloat2One() {
        return float2One;
    }

    public void setFloat2One(Float float2One) {
        this.float2One = float2One;
    }

    public Double getDouble2One() {
        return double2One;
    }

    public void setDouble2One(Double double2One) {
        this.double2One = double2One;
    }

    public Character getChar2One() {
        return char2One;
    }

    public void setChar2One(Character char2One) {
        this.char2One = char2One;
    }

    public Boolean getBoolean2One() {
        return boolean2One;
    }

    public void setBoolean2One(Boolean boolean2One) {
        this.boolean2One = boolean2One;
    }
    //преобразование типов:
    double q = 3.89;
    int p = (int) q; //Результат будет 3

    int r = 4;
    byte n = (byte)r;

    long a = 4;
    int h = (int) a;

    double x = 56.9898;
    int g = (int)x;  // g будет равно 56!

    public static void main(String[] args) {
        byte b = 127;
        short s = -13659;
        int i = 826285;
        long l = 645651L;
        float f = -2.859f;
        double d = -3.14;
        char ch = 'v';
        boolean bl = false;

        Byte b2 = 1;
        Short s2 = 1;
        Integer i2 = 1;
        Long l2 = 1L;
        Float f2 = 1.0f;
        Double d2 = 1.0;
        Character ch2 = '1';
        Boolean bli = true;

        Two two = new Two();
        two.setByteTwo((byte) 130);
        two.setChTwo('w');
        two.setDblTwo(3.14);
        two.setFlTwo(36.6f);
        two.setIntTwo(1024);
        two.setLongTwo(5222525);
        two.setShortTwo((short) 1234);
        two.setConditionTwo(false);

        two.setByte2Two((byte)-127);
        two.setCh2Two('i');
        two.setCondition2Two(true);
        two.setDbl2Two(32.526);
        two.setInt2Two(2_562_956);
        two.setFl2Two(3.89652f);
        two.setLong2Two(25446367571765L);
        two.setShort2Two((short)-863259);



        System.out.println("Локальные примитивные переменные метода main:");
        System.out.println("byte - " + b);
        System.out.println("short - " + s);
        System.out.println("int - " + i);
        System.out.println("long" + l);
        System.out.println("floot - " + f);
        System.out.println("double - " + d);
        System.out.println("char - " + ch);
        System.out.println("boolean - " + bl);

        System.out.println("\nЛокальные обертки класса main:");
        System.out.println("Byte - " + b2);
        System.out.println("Short - " + s2);
        System.out.println("Integer" + i2);
        System.out.println("Long - " + l2);
        System.out.println("Floot - " + f2);
        System.out.println("Double - " + d2);
        System.out.println("Character - " + ch2);
        System.out.println("Boolean - " + bli);

        System.out.println("\nГлобальные примитивные переменные класса Two объекта two:");
        System.out.println ("byte - " + two.getByte2Two());
        System.out.println("short - " + two.getShort2Two());
        System.out.println("int - " + two.getInt2Two());
        System.out.println("long" + two.getLong2Two());
        System.out.println("floot - " + two.getFl2Two());
        System.out.println("double - " + two.getDbl2Two());
        System.out.println("char - " + two.getCh2Two());

        System.out.println("\nГлобальные обертки класса Two объекта two:");
        System.out.println ("Byte - " + two.getByteTwo());
        System.out.println("Short - " + two.getShortTwo());
        System.out.println("Integer - " + two.getIntTwo());
        System.out.println("Long" + two.getLongTwo());
        System.out.println("Floot - " + two.getFlTwo());
        System.out.println("Double - " + two.getDblTwo());
        System.out.println("Character - " + two.getChTwo());
        System.out.println("Boolean - " + two.getCondition2Two());

        System.out.println("\nЛокальные примитивные переменные класса One т.к. не заданы будут иметь по умолчанию следующие значения:");
        System.out.println ("byteOne - 0");
        System.out.println("short - " + 0);
        System.out.println("int - " + 0);
        System.out.println("long" + 0l);
        System.out.println("floot - " + 0.0f);
        System.out.println("double - " + 0.0);
        System.out.println("char - + \u0000");

        System.out.println("\nЛокальные обертки класса One т.к. не заданы будут иметь по умолчанию будут null");
    }
}

