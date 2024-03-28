import org.junit.*;

public class IsValidDateFunctionTest {
    // UTCID01
    @Test
    public void January0th2400ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2400, (byte) 1, (byte) 0));
    }

    // UTCID02b
    @Test
    public void January1st2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 1, (byte) 1));
    }

    // UTCID03
    @Test
    public void January31st2004ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2004, (byte) 1, (byte) 31));
    }

    // UTCID04
    @Test
    public void January32nd2023ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2023, (byte) 1, (byte) 32));
    }

    // UTCID05
    @Test
    public void February0th2400ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2400, (byte) 2, (byte) 0));
    }

    // UTCID06
    @Test
    public void February1st2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 2, (byte) 1));
    }

    // UTCID07
    @Test
    public void February28th2023ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2023, (byte) 2, (byte) 28));
    }

    // UTCID08
    @Test
    public void February29th2023ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2023, (byte) 2, (byte) 29));
    }

    // UTCID09
    @Test
    public void February28th2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 2, (byte) 28));
    }

    // UTCID10
    @Test
    public void February29th2100ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2100, (byte) 2, (byte) 29));
    }

    // UTCID11
    @Test
    public void February29th2400ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2400, (byte) 2, (byte) 29));
    }

    // UTCID12
    @Test
    public void February30th2400ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2400, (byte) 2, (byte) 30));
    }

    // UTCID13
    @Test
    public void February29th2004ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2004, (byte) 2, (byte) 29));
    }

    // UTCID14
    @Test
    public void February30th2004ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2004, (byte) 2, (byte) 30));
    }

    // UTCID15
    @Test
    public void March31st2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 3, (byte) 31));
    }

    // UTCID16
    @Test
    public void March32nd2100ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2100, (byte) 3, (byte) 32));
    }

    // UTCID17
    @Test
    public void April30th2023ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2023, (byte) 4, (byte) 30));
    }

    // UTCID18
    @Test
    public void April31st2023ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2023, (byte) 4, (byte) 31));
    }

    // UTCID19
    @Test
    public void May31st2400ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2400, (byte) 5, (byte) 31));
    }

    // UTCID20
    @Test
    public void May32nd2400ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2400, (byte) 5, (byte) 32));
    }

    // UTCID21
    @Test
    public void June30th2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 6, (byte) 30));
    }

    // UTCID22
    @Test
    public void June31st2100ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2100, (byte) 6, (byte) 31));
    }

    // UTCID23
    @Test
    public void July31st2004ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2004, (byte) 7, (byte) 31));
    }

    // UTCID24
    @Test
    public void July32nd2004ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2004, (byte) 7, (byte) 32));
    }

    // UTCID25
    @Test
    public void August31st2023ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2023, (byte) 8, (byte) 31));
    }

    // UTCID26
    @Test
    public void August32nd2023ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2023, (byte) 8, (byte) 32));
    }

    // UTCID27
    @Test
    public void September30th2400ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2400, (byte) 9, (byte) 30));
    }

    // UTCID28
    @Test
    public void September31st2400ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2400, (byte) 9, (byte) 31));
    }

    // UTCID29
    @Test
    public void October31st2100ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2100, (byte) 10, (byte) 31));
    }

    // UTCID30
    @Test
    public void October32nd2100ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2100, (byte) 10, (byte) 32));
    }

    // UTCID31
    @Test
    public void November30th2004ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2004, (byte) 11, (byte) 30));
    }

    // UTCID32
    @Test
    public void November31st2004ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2004, (byte) 11, (byte) 31));
    }

    // UTCID33
    @Test
    public void December31st2023ShouldBeValid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertTrue(checker.IsValidDate((short) 2023, (byte) 12, (byte) 31));
    }

    // UTCID34
    @Test
    public void December32nd2023ShouldBeInvalid() {
        DateTimeChecker checker = new DateTimeChecker();
        Assert.assertFalse(checker.IsValidDate((short) 2023, (byte) 12, (byte) 32));
    }
}
