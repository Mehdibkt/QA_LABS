import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void test_1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }
  @Test
  void test_2() {
    Date d = new Date(2005 ,04 ,15);
    assertEquals(new Date(2005 ,04 ,16), d.nextDate());
  }
  @Test
  void test_3() {
    Date d = new Date(1901 ,07 ,20);
    assertEquals(new Date(1901 ,07 ,21), d.nextDate());
  }
  @Test
  void test_4() {
    Date d = new Date(3456 ,03 ,27);
    assertEquals(new Date(3456 ,03 ,28), d.nextDate());
  }
  @Test
  void test_5() {
    Date d = new Date(1500 ,02 ,17);
    assertEquals(new Date(1500 ,02 ,18), d.nextDate());
  }
  @Test
  void test_6() {
    Date d = new Date(1700 ,06 ,29);
    assertEquals(new Date(1700 ,06 ,30), d.nextDate());
  }
  @Test
  void test_7() {
    Date d = new Date(1800 ,11 ,29);
    assertEquals(new Date(1800 ,11 ,30), d.nextDate());
  }
  @Test
  void test_8() {
    Date d = new Date(3453 ,01 ,29);
    assertEquals(new Date(3453 ,01 ,30), d.nextDate());
  }
  @Test
  void test_9() {
    Date d = new Date(444 ,02 ,29);
    assertEquals(new Date(444 ,03,01), d.nextDate());
  }
  @Test
  void test_10() {
    Date d = new Date(2005 ,04 ,30);
    assertEquals(new Date(2005 ,05 ,01), d.nextDate());
  }
  @Test
  void test_11() {
    Date d = new Date(3453 ,01 ,30);
    assertEquals(new Date(3453 ,01 ,31), d.nextDate());
  }
  @Test
  void test_12() {
    Date d = new Date(3456 ,03 ,30);
    assertEquals(new Date(3456 ,03 ,31), d.nextDate());
  }
  @Test
  void test_13() {
    Date d = new Date(1901 ,07 ,31);
    assertEquals(new Date(1901 ,8 ,01), d.nextDate());
  }
  @Test
  void test_14() {
    Date d = new Date(3453 ,01 ,31);
    assertEquals(new Date(3453 ,02 ,01), d.nextDate());
  }
  @Test
  void test_15() {
    Date d = new Date(3456 ,12 ,31);
    assertEquals(new Date(3457 ,01, 01), d.nextDate());
  }
  @Test
  void test_16() {
    assertThrows(IllegalArgumentException.class, ()->{new Date(1500,2,31).nextDate();},"day must be less than 28 for month February on a non leap year.");
  }
  @Test
  void test_17() {
    assertThrows(IllegalArgumentException.class, ()->{new Date(1500 ,02 ,29).nextDate();},"day must be less than 28 for month February on a non leap year.");
  }
  @Test
  void test_18() {
    assertThrows(IllegalArgumentException.class, ()->{new Date(-1 ,10 ,20).nextDate();},"year must be greater or equal to 0.");
  }
  @Test
  void test_19() {
    assertThrows(IllegalArgumentException.class, ()->{new Date(1458 ,15 ,12).nextDate();},"month must be between 1 and 12.");
  }
  @Test
  void test_20() {
    assertThrows(IllegalArgumentException.class, ()->{new Date(1975 ,6 ,-50).nextDate();},"day must be greater or equal to 1.");
  }

}