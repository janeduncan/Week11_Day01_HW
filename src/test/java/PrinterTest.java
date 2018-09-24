import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 75);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getPaperCount());
    }

    @Test
    public void hasToner(){
        assertEquals(75, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        printer.print(2, 10);
        assertEquals(30, printer.getPaperCount());
        assertEquals(55, printer.getTonerVolume());
    }

    @Test
    public void doesNotPrintIfInsufficientPaper(){
        printer.print(5, 15);
        assertEquals(50, printer.getPaperCount());
        assertEquals(75, printer.getTonerVolume());
    }

    @Test
    public void canRefillPaper(){
        printer.refillPaper(30);
        assertEquals(80, printer.getPaperCount());
    }

}