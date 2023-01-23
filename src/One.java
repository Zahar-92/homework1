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
        two.getByteTwo();
        two.getChTwo();
        two.getDblTwo();
        two.getFlTwo();
        two.getIntTwo();
        two.getLongTwo();


        System.out.println("Примитивные типы данных класса main:");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bl);

        System.out.println("\nОбертки класса main:");
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(ch2);
        System.out.println(bli);
    }
}

