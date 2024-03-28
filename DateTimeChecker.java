import java.util.Scanner;

public class DateTimeChecker {
    public boolean IsLeapYear(short Year) {
        if (Year % 400 == 0)
            return true;
        else if (Year % 100 == 0)
            return false;
        else if (Year % 4 == 0)
            return true;
        else
            return false;
    }

    public byte DaysInMonth(short Year, byte Month) {
        switch (Month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (IsLeapYear(Year))
                    return 29;
        }
        return 28;
    }

    public boolean IsValidDate(short Year, byte Month, byte Day) {
        if (Month >= 1 && Month <= 12)
            if (Day >= 1 && Day <= DaysInMonth(Year, Month))
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short year = sc.nextShort();
        byte month = sc.nextByte();
        byte day = sc.nextByte();
        DateTimeChecker check = new DateTimeChecker();
        System.out.print(check.IsValidDate(year, month, day));

        sc.close();
    }
}