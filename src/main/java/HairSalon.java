import java.util.Arrays;

public class HairSalon {

  private String[] openingDays = { "Monday", "Tuesday" };

  public String[] getOpeningDays() {
    return openingDays;
  }

  public boolean isOpen(String weekDay) {
    if (!weekDay.endsWith("day")) {
      throw new IllegalArgumentException("The weekday argument must end in the letters 'day'");
    }
    if (Arrays.asList(openingDays).contains(weekDay)) {
      return true;
    } else {
      return false;
    }
  }
  
}
