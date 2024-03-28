import org.junit.*;;

public class DaysInMonthFunctionTest {
    // UTCID01
    @Test
    public void January2400ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2400, (byte) 1));
    }

    // UTCID02
    @Test
    public void February2400ShouldHave29Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(29, checker.DaysInMonth((short) 2400, (byte) 2));
    }

    // UTCID03
    @Test
    public void February2100ShouldHave28Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(28, checker.DaysInMonth((short) 2100, (byte) 2));
    }

    // UTCID04
    @Test
    public void February2004ShouldHave29Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(29, checker.DaysInMonth((short) 2004, (byte) 2));
    }

    // UTCID05
    @Test
    public void February2023ShouldHave28Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(28, checker.DaysInMonth((short) 2023, (byte) 2));
    }

    // UTCID06
    @Test
    public void March2400ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2400, (byte) 3));
    }

    // UTCID07
    @Test
    public void April2100ShouldHave30Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(30, checker.DaysInMonth((short) 2100, (byte) 4));
    }

    // UTCID08
    @Test
    public void April2100ShouldNotHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertNotEquals(31, checker.DaysInMonth((short) 2100, (byte) 4));
    }

    // UTCID09
    @Test
    public void May2023ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2023, (byte) 5));
    }

    // UTCID10
    @Test
    public void June2004ShouldHave30Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(30, checker.DaysInMonth((short) 2004, (byte) 6));
    }

    // UTCID11
    @Test
    public void June2004ShouldNotHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertNotEquals(31, checker.DaysInMonth((short) 2004, (byte) 6));
    }

    // UTCID12
    @Test
    public void July2100ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2100, (byte) 7));
    }

    // UTCID13
    @Test
    public void August2023ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2023, (byte) 8));
    }

    // UTCID14
    @Test
    public void September2400ShouldHave30Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(30, checker.DaysInMonth((short) 2400, (byte) 9));
    }

    // UTCID15
    @Test
    public void September2400ShouldNotHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertNotEquals(31, checker.DaysInMonth((short) 2400, (byte) 9));
    }

    // UTCID16
    @Test
    public void October2004ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2004, (byte) 10));
    }

    // UTCID17
    @Test
    public void November2023ShouldHave30Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(30, checker.DaysInMonth((short) 2023, (byte) 11));
    }

    // UTCID18
    @Test
    public void November2023ShouldNotHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertNotEquals(31, checker.DaysInMonth((short) 2023, (byte) 11));
    }

    // UTCID19
    @Test
    public void December2100ShouldHave31Days() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertEquals(31, checker.DaysInMonth((short) 2100, (byte) 12));
    }
}
